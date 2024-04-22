package com.hixtrip.sample.client.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Objects;

/**
 * 支付回调的入参
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommandPayDTO {

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 支付渠道Id
     */
    private Long channelId;

    private Map<String, String> params;

    private String originData;

}
