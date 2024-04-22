package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;

/**
 * 运费计算
 *
 * 根据后端配置的运费模板计算运费
 *
 * -根据区域id去最匹配
 * @author xingkong
 */
public class SkuFreightRender implements CartRenderStep {
    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.SKU_FREIGHT;
    }

    @Override
    public void render(TradeDTO tradeDTO) {

    }
}
