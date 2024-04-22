package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.domain.goods.vo.GoodsSkuItemVO;
import com.hixtrip.sample.client.order.dto.TradeDTO;
import com.hixtrip.sample.client.order.vo.CartVO;
import com.hixtrip.sample.domain.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品库存步骤
 * @author xingkong
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class GoodsStockUpdateRender implements CartRenderStep {
    private final InventoryRepository inventoryRepository;

    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.STUCK_UPDATE;
    }

    @Override
    public void render(TradeDTO tradeDTO) {
        //购物车列表
        List<CartVO> cartList = tradeDTO.getCartList();
        if (cartList == null) {
            throw new RuntimeException("购物车列表为空");
        }

        //要扣除的sku列表
        List<GoodsSkuItemVO> goodsSkuItemList = new ArrayList<>();

        cartList.forEach(cartVO -> cartVO.getCheckedSkuList().forEach(check->{
            GoodsSkuItemVO goodsSkuItemVO = new GoodsSkuItemVO();
            goodsSkuItemVO.setGoodsId(check.getGoodsSku().getGoodsId());
            goodsSkuItemVO.setSkuId(check.getGoodsSku().getId());
            goodsSkuItemVO.setNum(check.getNum());
            goodsSkuItemList.add(goodsSkuItemVO);
        }));
        inventoryRepository.deductStock(goodsSkuItemList);
    }
}
