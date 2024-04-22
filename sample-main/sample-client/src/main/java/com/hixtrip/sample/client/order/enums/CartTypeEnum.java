package com.hixtrip.sample.client.order.enums;

/**
 * 购物车类型
 * @author xingkong
 */
public enum CartTypeEnum {
    /**
     * 购物车
     */
    CART,
    /**
     * 立即购买
     */
    BUY_NOW,
    ;

    public String getPrefix() {
        return "{" + this.name() + "}:";
    }
}
