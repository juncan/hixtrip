package com.hixtrip.sample.client.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 支付通知 Response DTO
 * @author xingkong
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayOrderNotifyRespDTO {
    /**
     * 支付订单号（支付模块的）
     */
    private String orderExtensionNo;
    /**
     * 支付订单号
     */
    private String orderId;

    /**
     * 支付订单号
     */
    private String outTradeNo;

    /**
     * 租户Id
     */
    private Long tenantId;

    /**
     * 支付渠道编号
     */
    private String channelOrderNo;
    /**
     * 支付渠道用户编号
     */
    private String channelUserId;
    /**
     * 支付成功时间
     */
    private LocalDateTime successTime;

    /**
     * 通知的原始数据
     *
     * 主要用于持久化，方便后续修复数据，或者排错
     */
    private String data;

    /**
     * 结合其他的渠道定义成枚举,
     * alipay
     * TRADE_CLOSED,未付款交易超时关闭，或支付完成后全额退款。
     * TRADE_SUCCESS, 交易支付成功
     * TRADE_FINISHED 	交易结束，不可退款。
     */
    private String tradeStatus;
}
