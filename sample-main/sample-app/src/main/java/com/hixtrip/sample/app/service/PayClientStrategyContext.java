package com.hixtrip.sample.app.service;

import com.hixtrip.sample.app.api.PayClient;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 支付客户端实现类

 * @author xingkong
 * @date 2024/4/22 16:18
 */
@Slf4j
@Service
public class PayClientStrategyContext {
    private final Map<Long, PayClient> clients = new ConcurrentHashMap<>();

    public PayClientStrategyContext(@NotNull Map<Long, PayClient> strategyMap) {
        this.clients.clear();
        this.clients.putAll(strategyMap);
    }

    public PayClient getPayClient(Long channelId) {
        return clients.get(channelId);
    }
}
