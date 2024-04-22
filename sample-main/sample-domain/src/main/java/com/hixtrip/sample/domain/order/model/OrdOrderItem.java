package com.hixtrip.sample.domain.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 子订单表
 */
public class OrdOrderItem implements Serializable {
    /**
     * 子订单编号
     */
    private String id;

    /**
     * 交易编号
     */
    private String tradeId;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 商品ID
     */
    private Long goodsId;

    /**
     * 商品编码
     */
    private String goodsCode;

    /**
     * 图片
     */
    private String goodsImage;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品类型 1:实物商品
     */
    private String goodsType;

    /**
     * 商品来源类型 1：平台 2：配送点
     */
    private String goodsSourceType;

    /**
     * 货品ID
     */
    private Long skuId;

    /**
     * 购买量-销售量
     */
    private Integer num;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 实际金额
     */
    private BigDecimal flowPrice;

    /**
     * 销售金额
     */
    private BigDecimal goodsPrice;

    /**
     * 小记
     */
    private BigDecimal subTotal;

    /**
     * 优惠券金额
     */
    private BigDecimal couponPrice;

    /**
     * 运费
     */
    private BigDecimal freightPrice;

    /**
     * 结算金额
     */
    private BigDecimal settlePrice;

    /**
     * 售后单Id
     */
    private Long afterSaleId;

    /**
     * 可申请售后状态
     */
    private String afterSaleStatus;

    /**
     * 退货数量
     */
    private Integer afterSaleNum;

    /**
     * 售后服务状态
     */
    private String serviceStatus;

    /**
     * 评论状态
     */
    private String commentStatus;

    /**
     * 租户ID
     */
    private Long tenantId;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除（0正常 1已删除）
     */
    private Integer deleted;

    /**
     * 备注
     */
    private String remark;

    /**
     * 规格json
     */
    private String specs;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsSourceType() {
        return goodsSourceType;
    }

    public void setGoodsSourceType(String goodsSourceType) {
        this.goodsSourceType = goodsSourceType;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getFlowPrice() {
        return flowPrice;
    }

    public void setFlowPrice(BigDecimal flowPrice) {
        this.flowPrice = flowPrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public BigDecimal getFreightPrice() {
        return freightPrice;
    }

    public void setFreightPrice(BigDecimal freightPrice) {
        this.freightPrice = freightPrice;
    }

    public BigDecimal getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = settlePrice;
    }

    public Long getAfterSaleId() {
        return afterSaleId;
    }

    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }

    public String getAfterSaleStatus() {
        return afterSaleStatus;
    }

    public void setAfterSaleStatus(String afterSaleStatus) {
        this.afterSaleStatus = afterSaleStatus;
    }

    public Integer getAfterSaleNum() {
        return afterSaleNum;
    }

    public void setAfterSaleNum(Integer afterSaleNum) {
        this.afterSaleNum = afterSaleNum;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrdOrderItem other = (OrdOrderItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsImage() == null ? other.getGoodsImage() == null : this.getGoodsImage().equals(other.getGoodsImage()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsType() == null ? other.getGoodsType() == null : this.getGoodsType().equals(other.getGoodsType()))
            && (this.getGoodsSourceType() == null ? other.getGoodsSourceType() == null : this.getGoodsSourceType().equals(other.getGoodsSourceType()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getUnitPrice() == null ? other.getUnitPrice() == null : this.getUnitPrice().equals(other.getUnitPrice()))
            && (this.getFlowPrice() == null ? other.getFlowPrice() == null : this.getFlowPrice().equals(other.getFlowPrice()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getSubTotal() == null ? other.getSubTotal() == null : this.getSubTotal().equals(other.getSubTotal()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getFreightPrice() == null ? other.getFreightPrice() == null : this.getFreightPrice().equals(other.getFreightPrice()))
            && (this.getSettlePrice() == null ? other.getSettlePrice() == null : this.getSettlePrice().equals(other.getSettlePrice()))
            && (this.getAfterSaleId() == null ? other.getAfterSaleId() == null : this.getAfterSaleId().equals(other.getAfterSaleId()))
            && (this.getAfterSaleStatus() == null ? other.getAfterSaleStatus() == null : this.getAfterSaleStatus().equals(other.getAfterSaleStatus()))
            && (this.getAfterSaleNum() == null ? other.getAfterSaleNum() == null : this.getAfterSaleNum().equals(other.getAfterSaleNum()))
            && (this.getServiceStatus() == null ? other.getServiceStatus() == null : this.getServiceStatus().equals(other.getServiceStatus()))
            && (this.getCommentStatus() == null ? other.getCommentStatus() == null : this.getCommentStatus().equals(other.getCommentStatus()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSpecs() == null ? other.getSpecs() == null : this.getSpecs().equals(other.getSpecs()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsImage() == null) ? 0 : getGoodsImage().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsType() == null) ? 0 : getGoodsType().hashCode());
        result = prime * result + ((getGoodsSourceType() == null) ? 0 : getGoodsSourceType().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getUnitPrice() == null) ? 0 : getUnitPrice().hashCode());
        result = prime * result + ((getFlowPrice() == null) ? 0 : getFlowPrice().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getSubTotal() == null) ? 0 : getSubTotal().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getFreightPrice() == null) ? 0 : getFreightPrice().hashCode());
        result = prime * result + ((getSettlePrice() == null) ? 0 : getSettlePrice().hashCode());
        result = prime * result + ((getAfterSaleId() == null) ? 0 : getAfterSaleId().hashCode());
        result = prime * result + ((getAfterSaleStatus() == null) ? 0 : getAfterSaleStatus().hashCode());
        result = prime * result + ((getAfterSaleNum() == null) ? 0 : getAfterSaleNum().hashCode());
        result = prime * result + ((getServiceStatus() == null) ? 0 : getServiceStatus().hashCode());
        result = prime * result + ((getCommentStatus() == null) ? 0 : getCommentStatus().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSpecs() == null) ? 0 : getSpecs().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeId=").append(tradeId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", goodsImage=").append(goodsImage);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsSourceType=").append(goodsSourceType);
        sb.append(", skuId=").append(skuId);
        sb.append(", num=").append(num);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", flowPrice=").append(flowPrice);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", subTotal=").append(subTotal);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", freightPrice=").append(freightPrice);
        sb.append(", settlePrice=").append(settlePrice);
        sb.append(", afterSaleId=").append(afterSaleId);
        sb.append(", afterSaleStatus=").append(afterSaleStatus);
        sb.append(", afterSaleNum=").append(afterSaleNum);
        sb.append(", serviceStatus=").append(serviceStatus);
        sb.append(", commentStatus=").append(commentStatus);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", remark=").append(remark);
        sb.append(", specs=").append(specs);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}