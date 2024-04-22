package com.hixtrip.sample.client.order.vo;

import com.hixtrip.sample.client.order.dto.PriceDetailDTO;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单价格详情
 * @author xingkong
 */
@Data
public class PriceDetailVO implements Serializable {
    private static final long serialVersionUID = 4717254356249654704L;

    /**
     * 商品原价
     */
    private BigDecimal originalPrice;

    /**
     * 配送费
     */
    private BigDecimal freight;

    /**
     * 优惠金额
     */
    private BigDecimal discountPrice;

    /**
     * 支付积分
     */
    private Long payPoint;

    /**
     * 最终成交金额
     */
    private BigDecimal finalePrice;

    /**
     * 优惠券金额
     */
    private BigDecimal couponAmount;
    /**
     * 构造器，初始化默认值
     */
    public PriceDetailVO(PriceDetailDTO dto) {
        this.freight = dto.getFreightPrice();
        this.finalePrice = dto.getFlowPrice();
        this.discountPrice = dto.getDiscountPrice();
        this.payPoint = dto.getPayPoint();
        this.originalPrice = dto.getGoodsPrice();
        this.couponAmount = dto.getCouponPrice();
    }

    public PriceDetailVO(){

    }
}
