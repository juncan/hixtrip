package com.hixtrip.sample.infra;

import com.hixtrip.sample.domain.goods.vo.GoodsSkuItemVO;
import com.hixtrip.sample.domain.inventory.repository.InventoryRepository;
import com.hixtrip.sample.infra.db.IGoodsSkuService;
import com.hixtrip.sample.infra.db.impl.InventoryDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * infra层是domain定义的接口具体的实现
 */
@Slf4j
@Component
public class InventoryRepositoryImpl implements InventoryRepository {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private InventoryDomainService inventoryDomainService;

    @Autowired
    private DefaultRedisScript<Boolean> quantityScript;


    @Override
    public void deductStock(List<GoodsSkuItemVO> itemList) {
        //库存key 和 扣减数量
        List<String> keys = new ArrayList<>();
        List<String> values = new ArrayList<>();
        for (GoodsSkuItemVO item : itemList) {
            keys.add(IGoodsSkuService.getStockCacheKey(item.getSkuId()));
            int i = -item.getNum();
            values.add(Integer.toString(i));
        }

        List<Object> stocks = redisTemplate.opsForValue().multiGet(keys);


        //如果缓存中不存在存在等量的库存值，则重新写入缓存，防止缓存击穿导致无法下单
        checkStocks(stocks, itemList);

        //库存扣除结果 - 执行lua脚本
        Boolean skuResult = redisTemplate.execute(quantityScript, keys, values.toArray());
        //如果库存扣减都成功，则记录成交订单
        if (Boolean.TRUE.equals(skuResult)) {
            log.info("库存扣减成功,参数为{};{}", keys, values);
            //成功之后，同步库存
            synchroDB(itemList);
        } else {
            log.info("库存扣件失败，变更缓存key{} 变更缓存value{}", keys, values);
            //失败之后取消订单
            throw new RuntimeException("库存扣除失败");
        }
    }

    /**
     * todo 同步剩余库存到库
     * @param itemList 商品sku列表
     */
    private void synchroDB(List<GoodsSkuItemVO> itemList) {
    }

    private void checkStocks(List<Object> stocks, List<GoodsSkuItemVO> itemList) {
        if (itemList.size() == stocks.size()) {
            return;
        }
        initSkuCache(itemList);
    }

    private void initSkuCache(List<GoodsSkuItemVO> itemList) {
        itemList.forEach(orderItem -> {
            //获取sku库存并写入到redis
            inventoryDomainService.getInventory(orderItem.getSkuId());
        });
    }
}
