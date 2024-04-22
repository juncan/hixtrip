package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户优惠券
 * 1:渲染优惠券规则列表 - 获取最优优惠券信息
 * 2：渲染各个优惠的价格
 * @author xingkong
 */
@Service
@RequiredArgsConstructor
public class MemberCouponRender implements CartRenderStep {
    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.MEMBER_COUPON;
    }

    @Override
    public void render(TradeDTO tradeDTO) {

    }
}
