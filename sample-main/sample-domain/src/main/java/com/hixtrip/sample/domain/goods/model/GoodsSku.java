package com.hixtrip.sample.domain.goods.model;

import com.hixtrip.sample.domain.order.model.BaseAuditingEntity;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.math.BigDecimal;

/**
 * 商品sku实体
 * @author xingkong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Accessors(chain = true)
public class GoodsSku extends BaseAuditingEntity {
    private static final long serialVersionUID = 2440555348923704586L;
    /**
     * shu Id
     */
    private Long id;

    /**
     * 商品Id
     */
    private Long goodsId;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 外部规格编码
     */
    private String skuCode;

    /**
     * 规格值数组-json格式， [{propertId: , valueId: }, {propertId: , valueId: }]
     */
    private String properties;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 普通价
     */
    private BigDecimal commonPrice;

    /**
     * 重量
     */
    private Double weight;

    /**
     * 总库存
     */
    private Integer totalStock;

    /**
     * 库存数量
     */
    private Integer quantity;

    /**
     * 图片地址
     */
    private String picUrl;

    /**
     * 浏览数量
     */
    private Integer viewCount;

    /**
     * 销量
     */
    private Integer saleCount;

    /**
     * 店铺Id, -1:平台
     */
    private Long storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 状态： 0-正常 1-禁用
     */
    private Integer status;

    /**
     * 租户编号
     */
    private Long tenantId;
}
