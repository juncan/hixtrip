package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;

/**
 * 购物车金额计算
 * @author xingkong
 */
public class CartPriceRender implements CartRenderStep {
    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.CART_PRICE;
    }

    @Override
    public void render(TradeDTO tradeDTO) {

    }
}
