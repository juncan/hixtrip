package com.hixtrip.sample.app.api;

import com.hixtrip.sample.client.order.dto.CommandOderCreateDTO;
import com.hixtrip.sample.domain.order.model.OrdTrade;

/**
 * 订单的service层
 */
public interface OrderService {


    /**
     * 创建订单
     * @param userId 用户id
     * @param commandOderCreateDTO 请求信息
     * @return 交易订单信息
     */
    OrdTrade createOrder(String userId, CommandOderCreateDTO commandOderCreateDTO);
}
