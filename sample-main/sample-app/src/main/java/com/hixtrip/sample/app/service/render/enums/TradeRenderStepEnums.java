package com.hixtrip.sample.app.service.render.enums;

/**
 * 交易步骤枚举
 * @author xingkong
 */
public enum TradeRenderStepEnums {
    /**
     * 购物车渲染枚举
     */
    CHECK_DATA("校验商品"),
    CHECKED_FILTER("选择商品过滤"),
    CART_PRICE("购物车金额计算"),
    MEMBER_COUPON("用户优惠券渲染"),
    SKU_FREIGHT("运费计算"),
    STUCK_UPDATE("库存更新"),
    ORD_SN("订单编号创建");

    private final String distribution;

    public String getDistribution() {
        return distribution;
    }

    TradeRenderStepEnums(String distribution) {
        this.distribution = distribution;
    }
}
