package com.hixtrip.sample.client.order.dto;

import com.hixtrip.sample.client.order.vo.MemberCouponVO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

/**
 * 用于计算优惠券结算详情
 * @author xingkong
 */
@Data
@NoArgsConstructor
public class MemberCouponDTO implements Serializable {
    private static final long serialVersionUID = 3813320552927023477L;

    /**
     * 在购物车中时：key为sku id ，value为每个商品结算时的金额
     */
    private Map<Long, BigDecimal> skuDetail;

    /**
     * 优惠券详情
     */
    private MemberCouponVO memberCoupon;

    public MemberCouponDTO(Map<Long, BigDecimal> skuDetail, MemberCouponVO memberCoupon) {
        this.skuDetail = skuDetail;
        this.memberCoupon = memberCoupon;
    }
}
