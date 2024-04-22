package com.hixtrip.sample.app.service.render;

import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import lombok.experimental.UtilityClass;

/**
 * 渲染步骤申明
 * @author xingkong
 * @date 2024/4/22 13:13
 */
@UtilityClass
public class TradeRenderStepStatement {
    /**
     * 交易订单创建渲染
     */
    public static TradeRenderStepEnums[] tradeRender = {
            TradeRenderStepEnums.CHECKED_FILTER,
            TradeRenderStepEnums.CHECK_DATA,
            TradeRenderStepEnums.MEMBER_COUPON,
            TradeRenderStepEnums.SKU_FREIGHT,
            TradeRenderStepEnums.CART_PRICE,
            TradeRenderStepEnums.ORD_SN,
            TradeRenderStepEnums.STUCK_UPDATE,
    };
}
