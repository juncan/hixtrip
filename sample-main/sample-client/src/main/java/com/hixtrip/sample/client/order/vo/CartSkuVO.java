package com.hixtrip.sample.client.order.vo;

import com.hixtrip.sample.client.order.enums.CartTypeEnum;
import com.hixtrip.sample.domain.goods.model.GoodsSku;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 购物车中的产品
 * @author xingkong
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CartSkuVO extends CartBase implements Serializable {
    private static final long serialVersionUID = 3058090735676396526L;
    private String sn;
    /**
     * 对应的sku DO
     */
    private GoodsSku goodsSku;

    /**
     * 购买数量
     */
    private Integer num;

    /**
     * 购买时的划线价
     */
    private BigDecimal purchaseScribePrice;

    /**
     * 购买时的成交价
     */
    private BigDecimal purchasePrice;

    /**
     * 小记
     */
    private BigDecimal subTotal;

    /**
     * 划线小记
     */
    private BigDecimal scribeTotal;

    /**
     * 是否选中，要去结算 0:未选中 1:已选中，默认
     */
    private Boolean checked;

    /**
     * 是否免运费
     */
    private Boolean isFreeFreight;

    /**
     * 是否失效
     */
    private Boolean invalid;

    /**
     * 错误类型
     */
    private String errorType;

    /**
     * 购物车商品错误消息
     */
    private String errorMessage;

    /**
     * 积分购买 积分数量
     */
    private Long point;

    /**
     * 购物车类型
     * @see CartTypeEnum
     */
    private CartTypeEnum cartType;

    /**
     * 配送方式
     */
    private String deliveryMethod;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
