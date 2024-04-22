package com.hixtrip.sample.client.order.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户优惠券
 * @author xingkong
 */
@Data
@NoArgsConstructor
public class MemberCouponVO implements Serializable {
    private static final long serialVersionUID = 720218331628378846L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 归属类型 0：平台 1：站点
     */
    private String belongType;

    /**
     * 优惠券类型（0满减券 1折扣券
     */
    private String couponType;


    /**
     * 面额
     */
    private BigDecimal offsetAmount;

    /**
     * 折扣比例
     */
    private BigDecimal discountRatio;

    /**
     * 折扣上限
     */
    private BigDecimal discountLimit;

    /**
     * 优惠券名称
     */
    private String couponName;

    /**
     * 会员名称
     */
    private String memberName;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 可用时间（开始）
     */
    private LocalDateTime useStartTime;

    /**
     * 可用时间（结束）
     */
    private LocalDateTime useEndTime;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 领取类型（0自主领券 1系统派发）
     */
    private String receivingType;

    /**
     * 状态（0待使用 1已使用 2已过期,3不可用）
     */
    private String status;

    /**
     * 用券时间
     */
    private LocalDateTime useTime;

    /**
     * 是否已核销
     */
    private Boolean wipedStatus;

    /**
     * 满额限制（0为无门槛）
     */
    private BigDecimal consumeThreshold;

    /**
     * 优惠金额
     */
    private BigDecimal discountPrice;

    /**
     *适用范围（0全部商品 1部分商品）
     */
    private String useType;


    /**
     * 无法使用原因
     */
    private String reason;

    /**
     * 范围关联的id
     */
    private List<Long> scopeIds;

    /**
     * 租户编号
     */
    private Long tenantId;

    public MemberCouponVO(MemberCouponVO bean, String reason) {
        //setter bean
        this.reason = reason;
    }
}

