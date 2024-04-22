package com.hixtrip.sample.app.service.render;

import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;

/**
 * 购物车渲染步骤
 *
 * @author xingkong
 */
public interface CartRenderStep {
    /**
     * 渲染价格步骤
     *
     * @return 渲染枚举
     */
    TradeRenderStepEnums step();

    /**
     * 渲染一笔交易
     *
     * @param tradeDTO 交易DTO
     */
    void render(TradeDTO tradeDTO);
}
