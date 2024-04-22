package com.hixtrip.sample.domain.goods.model;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.hixtrip.sample.domain.order.model.BaseAuditingEntity;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 商品spu信息
 *
 * @author xingkong
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Accessors(chain = true)
public class goodsSpu extends BaseAuditingEntity {

    private static final long serialVersionUID = 3535784222900152619L;

    /**
     * 商品id
     */
    private Long id;

    /**
     * 商品编码-系统生成
     */
    private String goodsCode;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 商品标题
     */
    private String goodsTitle;

    /**
     * 商品副标题
     */
    private String goodsSubTitle;

    /**
     * 商品标签
     */
    private String goodsLabels;


    /**
     * 规格类型 1：统一规格 2：多规格
     */
    private String skuType;

    /**
     *限购条件 1：终身 2：每单 3 每天 4：每月 5：每年
     */
    private String limitBuyType;

    /**
     * 限购数量
     */
    private Integer limitBuyCount;

    /**
     * 起售数量
     */
    private Integer startBuyCount;

    /**
     * 销量
     */
    private Integer saleCount;

    /**
     * 卖点
     */
    private String sellPoint;

    /**
     * 分类id
     */
    private Long categoryId;

    /**
     * 品牌Id
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 商品封面图地址，以逗号分隔 最多上传2张
     */
    private String coverPic;

    /**
     * 商品轮播图，以逗号分隔 最多上传10张
     */
    private String carouselPic;

    /**
     * 排序字段
     */
    private Integer sort;

    /**
     * 最低原始价格
     */
    private BigDecimal originalPrice;

    /**
     * 最低普通价格
     */
    private BigDecimal commonPrice;


    /**
     * 库存数量
     */
    private Integer quantity;

    /**
     *商品来源类型 1：平台 2：店铺
     */
    private String sourceType;

    /**
     * 卖家Id  -1：平台
     */
    private Long storeId;

    /**
     * 卖家名字
     */
    private String storeName;

    /**
     * 是否禁售 0：否 1：是
     */
    private String forbidFlag;

    /**
     * 禁用原因
     */
    private String forbidReason;

    /**
     * 是否为分销商品(0否 1是)
     */
    private String isDistribution;

    /**
     * 分销奖励类型（0按金额  1按比例）
     */
    private String distributionMode;

    /**
     * 审核状态 0：待审核 1：审核通过 2：审核不通过
     */
    private String authFlag;

    /**
     * 审核原因
     */
    private String authReason;

    /**
     * 上下架状态： 1 上架（开启） 0 下架（禁用）2：上架中
     */
    private String status;

    /**
     @Schema(description = "")
     *
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private LocalDateTime upTime;

    /**
     * 下架时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private LocalDateTime downTime;

    /**
     * 开售类型 1：上架开售 2：定时开售
     */
    private String saleType;

    /**
     * 销售范围 1：全部 2：指定
     */
    private String saleRange;

    /**
     * 开售时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private LocalDateTime saleTime;

    /**
     * 配送方式 1：站点自提 2：配送上门 用逗号隔开存储
     */
    private String deliveryType;

    /**
     * 备货天数
     */
    private Integer stockDay;

    /**
     * 运费id
     */
    private Long freightId;

    /**
     * 租户编号
     */
    private Long tenantId;
}
