package com.hixtrip.sample.infra.db.impl;

import com.hixtrip.sample.domain.goods.model.GoodsSku;
import com.hixtrip.sample.infra.db.IGoodsSkuService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * sku库存操作
 *
 * @author xingkong
 * @date 2024/4/22 14:06
 */
@Component
@RequiredArgsConstructor
public class InventoryDomainService {
    private final RedisTemplate redisTemplate;
    /**
     * 获取sku当前库存
     *
     * @param skuId
     */
    public Integer getInventory(Long skuId) {
        String cacheKeys = IGoodsSkuService.getStockCacheKey(skuId);
        Integer stock = (Integer) redisTemplate.opsForValue().get(cacheKeys);
        if (stock != null) {
            return stock;
        } else {
            GoodsSku goodsSku = getGoodsSkuByIdFromDB(skuId);
            redisTemplate.opsForValue().set(cacheKeys, goodsSku.getQuantity());
            return goodsSku.getQuantity();
        }
    }

    /**
     * 从数据库获取 -- 可以再做一层商品sku信息的缓存

     * @param skuId 产品id
     * @return 商品sku信息
     */
    private GoodsSku getGoodsSkuByIdFromDB(Long skuId) {
        return null;
    }

    /**
     * 修改库存
     *
     * @param skuId
     * @param sellableQuantity    可售库存
     * @param withholdingQuantity 预占库存
     * @param occupiedQuantity    占用库存
     * @return
     */
    public Boolean changeInventory(String skuId, Long sellableQuantity, Long withholdingQuantity, Long occupiedQuantity) {
        //todo 需要你在infra实现，只需要实现缓存操作。
        return null;
    }
}
