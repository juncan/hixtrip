package com.hixtrip.sample.app.api;

import com.hixtrip.sample.app.core.model.ChannelRetMsg;
import com.hixtrip.sample.client.order.dto.PayNotifyDataDTO;
import com.hixtrip.sample.client.order.dto.PayOrderNotifyRespDTO;

import java.util.Map;

/**
 * 支付服务
 *
 * @author xingkong
 */
public interface PayClient {
    /**
     * 获得渠道编号
     *
     * @return 渠道编号
     */
    Long getId();

    /**
     * 解析支付单的通知结果
     *
     * @param data 通知结果
     * @return 解析结果
     * @throws Exception 解析失败，抛出异常
     */
    PayOrderNotifyRespDTO parseOrderNotify(PayNotifyDataDTO data) throws Exception;

    /**
     * 回调解析参数之前做的事情
     *
     * @param params 请求信息
     */
    default void before(Map<String, String> params) {

    }

    /**
     * 去重处理
     *
     * @param params 回调报文
     * @return
     */
    Boolean duplicateChecker(Map<String, String> params);

    /**
     * 验证是否渠道通知 - 验签
     *
     * @param notifyData 通知数据
     * @return 默认是 true
     */
    default boolean verifyNotifyData(PayNotifyDataDTO notifyData) {
        return true;
    }

    /**
     * 查询支付订单信息
     * @param payOrderId 支付订单号
     * @return
     */
    default ChannelRetMsg queryPayOrder(String payOrderId) {
        return null;
    }

    /**
     * 查询支付订单信息
     * @param payOrderId 支付订单号
     * @param payTime 支付时间
     * @return
     */
    default ChannelRetMsg queryPayOrder(String payOrderId, String payTime) {
        return queryPayOrder(payOrderId);
    }

    /**
     * 判断是否为退款通知
     *
     * @param notifyData 通知数据
     * @return 默认是 false
     */
    default boolean isRefundNotify(PayNotifyDataDTO notifyData) {
        return false;
    }
}
