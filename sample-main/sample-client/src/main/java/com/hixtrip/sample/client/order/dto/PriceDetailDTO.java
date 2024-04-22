package com.hixtrip.sample.client.order.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 用于计算价格的类
 * @author xingkong
 */
@Data
public class PriceDetailDTO {
    /**
     * 订单原始总价格
     * 用于订单价格修改金额计算使用
     */
    private BigDecimal originalPrice;

    /**
     * 商品总金额（商品原价）
     */
    private BigDecimal goodsPrice;

    /**
     * 商品总金额（商品划线价）
     */
    private BigDecimal goodsScribePrice;

    /**
     * 配送费
     */
    private BigDecimal freightPrice;

    //============discount price============

    /**
     * 支付积分
     */
    private Long payPoint;

    /**
     * 优惠金额
     */
    private BigDecimal discountPrice;

    /**
     * 优惠券金额
     */
    private BigDecimal couponPrice;


    /**
     * 流水金额(入账 出帐金额) =
     *             goodsPrice(商品总金额（商品原价）) + freightPrice(配送费) -
     *             discountPrice(优惠金额) + updatePrice(订单修改金额)
     */
    private BigDecimal flowPrice;

    /**
     * 结算价格 与 商家/供应商 结算价格
     */
    private BigDecimal settlementPrice;
}
