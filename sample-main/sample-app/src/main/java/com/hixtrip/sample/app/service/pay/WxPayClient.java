package com.hixtrip.sample.app.service.pay;

import com.hixtrip.sample.app.api.PayClient;
import com.hixtrip.sample.app.core.model.ChannelRetMsg;
import com.hixtrip.sample.client.order.dto.PayNotifyDataDTO;
import com.hixtrip.sample.client.order.dto.PayOrderNotifyRespDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xingkong
 * @date 2024/4/22 16:35
 */
@Component("WX_MIN_PAY")
@RequiredArgsConstructor
public class WxPayClient implements PayClient {
    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void before(Map<String, String> params) {

    }

    @Override
    public boolean verifyNotifyData(PayNotifyDataDTO notifyData) {
        return true;
    }

    @Override
    public ChannelRetMsg queryPayOrder(String payOrderId) {
        return null;
    }

    @Override
    public PayOrderNotifyRespDTO parseOrderNotify(PayNotifyDataDTO data) throws Exception {
        return null;
    }

    @Override
    public Boolean duplicateChecker(Map<String, String> params) {
        return null;
    }

}
