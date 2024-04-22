package com.hixtrip.sample.domain.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 * 订单表
 */
public class OrdOrder implements Serializable {
    /**
     * 订单编号
     */
    private String id;

    /**
     * 交易编号 关联Trade
     */
    private String tradeId;

    /**
     * 订单类型
     */
    private String orderType;

    /**
     * 促销类型 1：普通订单 2：赠品订单 3：拼团订单 4：积分订单 5：砍价订单
     */
    private String promotionType;

    /**
     * 促销Id
     */
    private Long promotionId;

    /**
     * 分销商id
     */
    private Long distributionId;

    /**
     * 分销员名称
     */
    private String distributionName;

    /**
     * 分销员手机号
     */
    private String distributionPhone;

    /**
     * 付款状态 1:待付款 2：已付款 3：已取消
     */
    private String payStatus;

    /**
     * 支付时间
     */
    private Date paymentTime;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 总价格
     */
    private BigDecimal flowPrice;

    /**
     * 优惠的金额
     */
    private BigDecimal discountPrice;

    /**
     * 优惠券金额
     */
    private BigDecimal couponPrice;

    /**
     * 运费
     */
    private BigDecimal freightPrice;

    /**
     * 订单商品总重量
     */
    private Double weight;

    /**
     * 买家Id
     */
    private Long memberId;

    /**
     * 买家用户名
     */
    private String memberName;

    /**
     * 买家用户手机号
     */
    private String memberPhone;

    /**
     * 店铺ID
     */
    private Long storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 物流公司CODE
     */
    private String logisticsCode;

    /**
     * 物流公司名称
     */
    private String logisticsName;

    /**
     * 送货单号
     */
    private String logisticsNo;

    /**
     * 送货时间
     */
    private Date logisticsTime;

    /**
     * 完成时间
     */
    private Date completeTime;

    /**
     * 提货码
     */
    private String verificationCode;

    /**
     * 收件人Id
     */
    private Long consigneeId;

    /**
     * 收件人手机
     */
    private String consigneeMobile;

    /**
     * 收件人姓名
     */
    private String consigneeName;

    /**
     * 收件人详细地址
     */
    private String consigneeDetail;

    /**
     * 收件人地址编码 ','分割
     */
    private String consigneeAddrCode;

    /**
     * 收件人地址名称  ','分割"
     */
    private String consigneeAddrPath;

    /**
     * 发件人Id
     */
    private Long shipperId;

    /**
     * 发件人电话
     */
    private String shipperMobile;

    /**
     * 发件人经纬度
     */
    private String shipperCenter;

    /**
     * 发件人联系人
     */
    private String shipperContacts;

    /**
     * 发件人地址
     */
    private String shipperAddr;

    /**
     * 订单来源
     */
    private String clientType;

    /**
     * 用户使用的优惠券Id,逗号隔开
     */
    private String useCouponId;

    /**
     * 是否显示 0：不显示 1：显示
     */
    private String showFlag;

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

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getDistributionId() {
        return distributionId;
    }

    public void setDistributionId(Long distributionId) {
        this.distributionId = distributionId;
    }

    public String getDistributionName() {
        return distributionName;
    }

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    public String getDistributionPhone() {
        return distributionPhone;
    }

    public void setDistributionPhone(String distributionPhone) {
        this.distributionPhone = distributionPhone;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getFlowPrice() {
        return flowPrice;
    }

    public void setFlowPrice(BigDecimal flowPrice) {
        this.flowPrice = flowPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLogisticsCode() {
        return logisticsCode;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    public Date getLogisticsTime() {
        return logisticsTime;
    }

    public void setLogisticsTime(Date logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public Long getConsigneeId() {
        return consigneeId;
    }

    public void setConsigneeId(Long consigneeId) {
        this.consigneeId = consigneeId;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeDetail() {
        return consigneeDetail;
    }

    public void setConsigneeDetail(String consigneeDetail) {
        this.consigneeDetail = consigneeDetail;
    }

    public String getConsigneeAddrCode() {
        return consigneeAddrCode;
    }

    public void setConsigneeAddrCode(String consigneeAddrCode) {
        this.consigneeAddrCode = consigneeAddrCode;
    }

    public String getConsigneeAddrPath() {
        return consigneeAddrPath;
    }

    public void setConsigneeAddrPath(String consigneeAddrPath) {
        this.consigneeAddrPath = consigneeAddrPath;
    }

    public Long getShipperId() {
        return shipperId;
    }

    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }

    public String getShipperMobile() {
        return shipperMobile;
    }

    public void setShipperMobile(String shipperMobile) {
        this.shipperMobile = shipperMobile;
    }

    public String getShipperCenter() {
        return shipperCenter;
    }

    public void setShipperCenter(String shipperCenter) {
        this.shipperCenter = shipperCenter;
    }

    public String getShipperContacts() {
        return shipperContacts;
    }

    public void setShipperContacts(String shipperContacts) {
        this.shipperContacts = shipperContacts;
    }

    public String getShipperAddr() {
        return shipperAddr;
    }

    public void setShipperAddr(String shipperAddr) {
        this.shipperAddr = shipperAddr;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getUseCouponId() {
        return useCouponId;
    }

    public void setUseCouponId(String useCouponId) {
        this.useCouponId = useCouponId;
    }

    public String getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(String showFlag) {
        this.showFlag = showFlag;
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
        OrdOrder other = (OrdOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeId() == null ? other.getTradeId() == null : this.getTradeId().equals(other.getTradeId()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getPromotionType() == null ? other.getPromotionType() == null : this.getPromotionType().equals(other.getPromotionType()))
            && (this.getPromotionId() == null ? other.getPromotionId() == null : this.getPromotionId().equals(other.getPromotionId()))
            && (this.getDistributionId() == null ? other.getDistributionId() == null : this.getDistributionId().equals(other.getDistributionId()))
            && (this.getDistributionName() == null ? other.getDistributionName() == null : this.getDistributionName().equals(other.getDistributionName()))
            && (this.getDistributionPhone() == null ? other.getDistributionPhone() == null : this.getDistributionPhone().equals(other.getDistributionPhone()))
            && (this.getPayStatus() == null ? other.getPayStatus() == null : this.getPayStatus().equals(other.getPayStatus()))
            && (this.getPaymentTime() == null ? other.getPaymentTime() == null : this.getPaymentTime().equals(other.getPaymentTime()))
            && (this.getPaymentMethod() == null ? other.getPaymentMethod() == null : this.getPaymentMethod().equals(other.getPaymentMethod()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getGoodsNum() == null ? other.getGoodsNum() == null : this.getGoodsNum().equals(other.getGoodsNum()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getFlowPrice() == null ? other.getFlowPrice() == null : this.getFlowPrice().equals(other.getFlowPrice()))
            && (this.getDiscountPrice() == null ? other.getDiscountPrice() == null : this.getDiscountPrice().equals(other.getDiscountPrice()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getFreightPrice() == null ? other.getFreightPrice() == null : this.getFreightPrice().equals(other.getFreightPrice()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getMemberPhone() == null ? other.getMemberPhone() == null : this.getMemberPhone().equals(other.getMemberPhone()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getLogisticsCode() == null ? other.getLogisticsCode() == null : this.getLogisticsCode().equals(other.getLogisticsCode()))
            && (this.getLogisticsName() == null ? other.getLogisticsName() == null : this.getLogisticsName().equals(other.getLogisticsName()))
            && (this.getLogisticsNo() == null ? other.getLogisticsNo() == null : this.getLogisticsNo().equals(other.getLogisticsNo()))
            && (this.getLogisticsTime() == null ? other.getLogisticsTime() == null : this.getLogisticsTime().equals(other.getLogisticsTime()))
            && (this.getCompleteTime() == null ? other.getCompleteTime() == null : this.getCompleteTime().equals(other.getCompleteTime()))
            && (this.getVerificationCode() == null ? other.getVerificationCode() == null : this.getVerificationCode().equals(other.getVerificationCode()))
            && (this.getConsigneeId() == null ? other.getConsigneeId() == null : this.getConsigneeId().equals(other.getConsigneeId()))
            && (this.getConsigneeMobile() == null ? other.getConsigneeMobile() == null : this.getConsigneeMobile().equals(other.getConsigneeMobile()))
            && (this.getConsigneeName() == null ? other.getConsigneeName() == null : this.getConsigneeName().equals(other.getConsigneeName()))
            && (this.getConsigneeDetail() == null ? other.getConsigneeDetail() == null : this.getConsigneeDetail().equals(other.getConsigneeDetail()))
            && (this.getConsigneeAddrCode() == null ? other.getConsigneeAddrCode() == null : this.getConsigneeAddrCode().equals(other.getConsigneeAddrCode()))
            && (this.getConsigneeAddrPath() == null ? other.getConsigneeAddrPath() == null : this.getConsigneeAddrPath().equals(other.getConsigneeAddrPath()))
            && (this.getShipperId() == null ? other.getShipperId() == null : this.getShipperId().equals(other.getShipperId()))
            && (this.getShipperMobile() == null ? other.getShipperMobile() == null : this.getShipperMobile().equals(other.getShipperMobile()))
            && (this.getShipperCenter() == null ? other.getShipperCenter() == null : this.getShipperCenter().equals(other.getShipperCenter()))
            && (this.getShipperContacts() == null ? other.getShipperContacts() == null : this.getShipperContacts().equals(other.getShipperContacts()))
            && (this.getShipperAddr() == null ? other.getShipperAddr() == null : this.getShipperAddr().equals(other.getShipperAddr()))
            && (this.getClientType() == null ? other.getClientType() == null : this.getClientType().equals(other.getClientType()))
            && (this.getUseCouponId() == null ? other.getUseCouponId() == null : this.getUseCouponId().equals(other.getUseCouponId()))
            && (this.getShowFlag() == null ? other.getShowFlag() == null : this.getShowFlag().equals(other.getShowFlag()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeId() == null) ? 0 : getTradeId().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getPromotionType() == null) ? 0 : getPromotionType().hashCode());
        result = prime * result + ((getPromotionId() == null) ? 0 : getPromotionId().hashCode());
        result = prime * result + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode());
        result = prime * result + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        result = prime * result + ((getDistributionPhone() == null) ? 0 : getDistributionPhone().hashCode());
        result = prime * result + ((getPayStatus() == null) ? 0 : getPayStatus().hashCode());
        result = prime * result + ((getPaymentTime() == null) ? 0 : getPaymentTime().hashCode());
        result = prime * result + ((getPaymentMethod() == null) ? 0 : getPaymentMethod().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getGoodsNum() == null) ? 0 : getGoodsNum().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getFlowPrice() == null) ? 0 : getFlowPrice().hashCode());
        result = prime * result + ((getDiscountPrice() == null) ? 0 : getDiscountPrice().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getFreightPrice() == null) ? 0 : getFreightPrice().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getMemberPhone() == null) ? 0 : getMemberPhone().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getLogisticsCode() == null) ? 0 : getLogisticsCode().hashCode());
        result = prime * result + ((getLogisticsName() == null) ? 0 : getLogisticsName().hashCode());
        result = prime * result + ((getLogisticsNo() == null) ? 0 : getLogisticsNo().hashCode());
        result = prime * result + ((getLogisticsTime() == null) ? 0 : getLogisticsTime().hashCode());
        result = prime * result + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        result = prime * result + ((getVerificationCode() == null) ? 0 : getVerificationCode().hashCode());
        result = prime * result + ((getConsigneeId() == null) ? 0 : getConsigneeId().hashCode());
        result = prime * result + ((getConsigneeMobile() == null) ? 0 : getConsigneeMobile().hashCode());
        result = prime * result + ((getConsigneeName() == null) ? 0 : getConsigneeName().hashCode());
        result = prime * result + ((getConsigneeDetail() == null) ? 0 : getConsigneeDetail().hashCode());
        result = prime * result + ((getConsigneeAddrCode() == null) ? 0 : getConsigneeAddrCode().hashCode());
        result = prime * result + ((getConsigneeAddrPath() == null) ? 0 : getConsigneeAddrPath().hashCode());
        result = prime * result + ((getShipperId() == null) ? 0 : getShipperId().hashCode());
        result = prime * result + ((getShipperMobile() == null) ? 0 : getShipperMobile().hashCode());
        result = prime * result + ((getShipperCenter() == null) ? 0 : getShipperCenter().hashCode());
        result = prime * result + ((getShipperContacts() == null) ? 0 : getShipperContacts().hashCode());
        result = prime * result + ((getShipperAddr() == null) ? 0 : getShipperAddr().hashCode());
        result = prime * result + ((getClientType() == null) ? 0 : getClientType().hashCode());
        result = prime * result + ((getUseCouponId() == null) ? 0 : getUseCouponId().hashCode());
        result = prime * result + ((getShowFlag() == null) ? 0 : getShowFlag().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
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
        sb.append(", orderType=").append(orderType);
        sb.append(", promotionType=").append(promotionType);
        sb.append(", promotionId=").append(promotionId);
        sb.append(", distributionId=").append(distributionId);
        sb.append(", distributionName=").append(distributionName);
        sb.append(", distributionPhone=").append(distributionPhone);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", paymentMethod=").append(paymentMethod);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", goodsNum=").append(goodsNum);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", flowPrice=").append(flowPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", freightPrice=").append(freightPrice);
        sb.append(", weight=").append(weight);
        sb.append(", memberId=").append(memberId);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", storeId=").append(storeId);
        sb.append(", storeName=").append(storeName);
        sb.append(", logisticsCode=").append(logisticsCode);
        sb.append(", logisticsName=").append(logisticsName);
        sb.append(", logisticsNo=").append(logisticsNo);
        sb.append(", logisticsTime=").append(logisticsTime);
        sb.append(", completeTime=").append(completeTime);
        sb.append(", verificationCode=").append(verificationCode);
        sb.append(", consigneeId=").append(consigneeId);
        sb.append(", consigneeMobile=").append(consigneeMobile);
        sb.append(", consigneeName=").append(consigneeName);
        sb.append(", consigneeDetail=").append(consigneeDetail);
        sb.append(", consigneeAddrCode=").append(consigneeAddrCode);
        sb.append(", consigneeAddrPath=").append(consigneeAddrPath);
        sb.append(", shipperId=").append(shipperId);
        sb.append(", shipperMobile=").append(shipperMobile);
        sb.append(", shipperCenter=").append(shipperCenter);
        sb.append(", shipperContacts=").append(shipperContacts);
        sb.append(", shipperAddr=").append(shipperAddr);
        sb.append(", clientType=").append(clientType);
        sb.append(", useCouponId=").append(useCouponId);
        sb.append(", showFlag=").append(showFlag);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}