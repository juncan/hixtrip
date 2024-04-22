package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 勾选商品过滤
 * @author xingkong
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class CheckFilterRender implements CartRenderStep {
    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.CHECKED_FILTER;
    }

    @Override
    public void render(TradeDTO tradeDTO) {

    }
}
