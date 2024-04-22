package com.hixtrip.sample.client.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 创建订单的请求 入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommandOderCreateDTO {

    ///**
    // * 商品规格id
    // */
    //private String skuId;
    //
    ///**
    // * 购买数量
    // */
    //private Integer amount;
    //
    ///**
    // * 用户id
    // */
    //private String userId;

    /**
     * 交易方式 购物车购买：CART/立即购买：BUY_NOW
     */
    private String way;

    /**
     * 客户端：H5/移动端 WECHAT_MP/小程序端
     */
    private String client;

    /**
     * 店铺备注
     */
    private List<StoreRemarkDTO> storeRemark;

    /**
     * 分销Id-谁分享的
     */
    private String shareUserId;


}
