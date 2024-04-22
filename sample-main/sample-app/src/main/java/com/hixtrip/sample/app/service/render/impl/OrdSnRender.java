package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 订单编号生成-可根据具体业务生成所需要的订单编号
 *
 * 包括订单编号和子订单编号
 *
 * 使用雪花算法生成id
 * @author xingkong
 */
@Service
@RequiredArgsConstructor
public class OrdSnRender implements CartRenderStep {
    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.ORD_SN;
    }

    @Override
    public void render(TradeDTO tradeDTO) {
        //生成各个sn

    }
}
