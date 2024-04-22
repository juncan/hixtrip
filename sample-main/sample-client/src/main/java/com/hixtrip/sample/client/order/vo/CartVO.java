package com.hixtrip.sample.client.order.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 购物车信息
 *
 * @author xingkong
 */
@Data
@NoArgsConstructor
public class CartVO extends CartBase implements Serializable {

    private static final long serialVersionUID = 1912864269209170504L;

    /**
     * 购物车中的产品列表
     */
    private List<CartSkuVO> skuList;

    /**
     * 编号
     */
    private String sn;

    /**
     * 购物车页展示时，店铺内的商品是否全选状态.1为店铺商品全选状态,0位非全选
     */
    private Boolean checked;

    /**
     * 重量
     */
    private Double weight;

    /**
     * 购物车商品数量
     */
    private Integer goodsNum;

    /**
     * 购物车备注
     */
    private String remark;

    /**
     * 优惠券使用信息
     */
    private String errorMsg;

    /**
     *配送方式
     */
    private String deliveryMethod;

    public CartVO(CartSkuVO cartSkuVO) {
        this.setStoreId(cartSkuVO.getStoreId());
        this.setStoreName(cartSkuVO.getStoreName());
        this.setDeliveryMethod(cartSkuVO.getDeliveryMethod());
        this.setSkuList(new ArrayList<>());
        this.setChecked(false);
        this.weight = 0d;
        this.remark = "";
    }

    public void addGoodsNum(Integer goodsNum) {
        if (this.goodsNum == null) {
            this.goodsNum = goodsNum;
        } else {
            this.goodsNum += goodsNum;
        }
    }


    /**
     * 过滤购物车中已选择的sku
     *
     * @return
     */
    public List<CartSkuVO> getCheckedSkuList() {
        if (skuList != null && !skuList.isEmpty()) {
            return skuList.stream().filter(CartSkuVO::getChecked).collect(Collectors.toList());
        }
        return skuList;
    }
}
