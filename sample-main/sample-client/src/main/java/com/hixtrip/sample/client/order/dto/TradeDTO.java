package com.hixtrip.sample.client.order.dto;

import com.hixtrip.sample.client.order.enums.CartTypeEnum;
import com.hixtrip.sample.client.order.vo.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 购物车视图
 * @author xingkong
 */
@Data
public class TradeDTO implements Serializable {
    private static final long serialVersionUID = -6336890502501159806L;

    /**
     * 交易id
     */
    private String id;

    /**
     * 购物车列表
     */
    private List<CartVO> cartList;

    /**
     * 整笔交易中所有的规格商品
     */
    private List<CartSkuVO> skuList;

    /**
     * 购物车车计算后的总价
     */
    private PriceDetailVO priceDetailVO;


    /**
     * 不支持购物车列表
     */
    private List<CartSkuVO> notSupportList;

    /**
     * 用户使用的优惠券id
     */
    private Long userCouponId;
    /**
     * 购物车类型
     */
    private CartTypeEnum cartTypeEnum;
    /**
     * 店铺备注
     */
    private List<StoreRemarkDTO> storeRemark;

    /**
     * 客户端类型
     */
    private String clientType;

    /**
     * 买家id
     */
    private Long memberId;

    /**
     * 促销类型
     */
    private String promotionType;

    /**
     * 促销id
     */
    private Long promotionId;

    /**
     * 买家名称
     */
    private String memberName;

    /**
     * 买家手机号
     */
    private String memberPhone;

    /**
     * 分销商id
     */
    private Long distributionId;


    /**
     * 收货地址
     */
    private MemberAddressVO memberAddress;


    /**
     * 不支持邮寄（运费）列表
     */
    private List<CartSkuVO> notSupportFreight;


    /**
     * 可用优惠券列表
     */
    private List<MemberCouponVO> canUseCoupons;

    /**
     * 无法使用优惠券无法使用的原因
     */
    private List<MemberCouponVO> cantUseCoupons;

    /**
     * 使用平台优惠券，一笔订单只能使用一个平台优惠券
     */
    private MemberCouponDTO platformCoupon;

    private Boolean userCancelUseCoupon;

    public TradeDTO(CartTypeEnum cartTypeEnum) {
        this.cartTypeEnum = cartTypeEnum;

        this.skuList = new ArrayList<>();
        this.cartList = new ArrayList<>();
        this.notSupportList = new ArrayList<>();
        this.notSupportFreight = new ArrayList<>();
        this.userCancelUseCoupon = false;
    }

    public TradeDTO() {
        this(CartTypeEnum.CART);
    }

    /**
     * 过滤购物车中已选择的sku
     *
     * @return 勾选的列表
     */
    public List<CartSkuVO> getCheckedSkuList() {
        if (skuList != null && !skuList.isEmpty()) {
            return skuList.stream().filter(CartSkuVO::getChecked).collect(Collectors.toList());
        }
        return skuList;
    }

    public void removeCoupon() {
        this.canUseCoupons = new ArrayList<>();
        this.cantUseCoupons = new ArrayList<>();
    }
}
