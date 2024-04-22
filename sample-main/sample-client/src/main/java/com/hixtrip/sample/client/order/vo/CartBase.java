package com.hixtrip.sample.client.order.vo;

import lombok.Data;

/**
 * 购物车基础信息

 * @author xingkong
 */
@Data
public class CartBase {
    /**
     * 卖家id
     */
    private Long storeId;

    /**
     * 卖家姓名
     */
    private String storeName;

    /**
     * 此商品价格流水计算
     */
    private PriceDetailVO priceDetailVO;
}
