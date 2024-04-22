package com.hixtrip.sample.domain.goods.vo;

import lombok.Data;

/**
 * @author xingkong
 * @date 2024/4/22 13:46
 */
@Data
public class GoodsSkuItemVO {
    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 货品ID
     */
    private Long skuId;

    /**
     * 数量
     */
    private Integer num;
}
