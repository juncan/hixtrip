package com.hixtrip.sample.entry;

import com.hixtrip.sample.app.api.OrderService;
import com.hixtrip.sample.app.api.PayClient;
import com.hixtrip.sample.app.service.PayClientStrategyContext;
import com.hixtrip.sample.client.order.dto.CommandOderCreateDTO;
import com.hixtrip.sample.client.order.dto.CommandPayDTO;
import com.hixtrip.sample.client.order.dto.PayNotifyDataDTO;
import com.hixtrip.sample.domain.order.model.OrdTrade;
import com.hixtrip.sample.app.core.annotaion.Idempotent;
import com.hixtrip.sample.app.core.model.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * todo 这是你要实现的
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    private final PayClientStrategyContext payClientStrategyContext;

    /**
     * todo 这是你要实现的接口
     *
     * @param commandOderCreateDTO 入参对象
     * @return 请修改出参对象
     */
    @PostMapping(path = "/command/order/create")
    //todo 可以加一层冥等验证，防止用户多次点击生成多个订单
    @Idempotent(key ="'trade:create:'" +"+#token",expireTime = 5)
    public R<OrdTrade> order(@RequestHeader(HttpHeaders.AUTHORIZATION) String token, @RequestBody CommandOderCreateDTO commandOderCreateDTO) {
        //登录信息可以在这里模拟
        var userId = "";
        return R.ok(orderService.createOrder(userId, commandOderCreateDTO));
    }

    /**
     * todo 这是模拟创建订单后，支付结果的回调通知
     * 【中、高级要求】需要使用策略模式处理至少三种场景：支付成功、支付失败、重复支付(自行设计回调报文进行重复判定)
     *
     * @param commandPayDTO 入参对象
     * @return 请修改出参对象
     */
    @PostMapping(path = "/command/order/pay/callback")
    public String payCallback(@RequestBody CommandPayDTO commandPayDTO) {
        // 校验支付渠道是否存在
        Long channelId = commandPayDTO.getChannelId();
        PayClient payClient = payClientStrategyContext.getPayClient(channelId);
        if (payClient == null) {
            log.error("[notifyPayOrder][渠道编号({}) 找不到对应的支付客户端]", channelId);
            throw new RuntimeException("找不到对应的支付客户端");
        }

        //初始化执行
        Map<String, String> params = commandPayDTO.getParams();
        payClient.before(params);

        //去重处理
        if (Boolean.TRUE.equals(payClient.duplicateChecker(params))) {
            return null;
        }

        // 校验通知数据是否合法 - 验签
        PayNotifyDataDTO notifyData = PayNotifyDataDTO.builder().params(params).body(commandPayDTO.getOriginData()).build();
        if (!payClient.verifyNotifyData(notifyData)) {
            return null;
        }

        // 如果是退款，则发起退款通知
        if (payClient.isRefundNotify(notifyData)) {
            //todo 发起退款通知
            return "SUCCESS";
        }

        //todo 如果非退款，则发起支付通知

        return "SUCCESS";
    }

}
