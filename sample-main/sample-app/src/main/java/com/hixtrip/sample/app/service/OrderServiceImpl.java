package com.hixtrip.sample.app.service;

import com.hixtrip.sample.app.api.OrderService;
import com.hixtrip.sample.app.service.render.TradeRenderStepStatement;
import com.hixtrip.sample.client.order.dto.CommandOderCreateDTO;
import com.hixtrip.sample.client.order.dto.TradeDTO;
import com.hixtrip.sample.client.order.enums.CartTypeEnum;
import com.hixtrip.sample.domain.order.model.OrdTrade;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * app层负责处理request请求，调用领域服务
 */
@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final TradeBuilderService tradeBuilder;

    @Autowired
    @Lazy
    private OrderServiceImpl self;

    @Override
    public OrdTrade createOrder(String userId, CommandOderCreateDTO commandOderCreateDTO) {
        //获取购物车
        CartTypeEnum cartTypeEnum = getCartType(commandOderCreateDTO.getWay());
        TradeDTO tradeDTO = tradeBuilder.readDTO(cartTypeEnum);
        //需要对购物车渲染
        tradeBuilder.renderCartBySteps(tradeDTO, TradeRenderStepStatement.tradeRender);
        //创建订单预校验
        createTradeCheck(tradeDTO);
        //构建交易 - 保证事务生效
        OrdTrade trade = self.createTrade(tradeDTO);
        this.cleanChecked(tradeBuilder.readDTO(cartTypeEnum));
        return trade;
    }

    @Transactional(rollbackFor = Exception.class)
    public OrdTrade createTrade(TradeDTO tradeDTO) {
        //新增交易表信息
        //新增订单表信息
        //新增子订单表信息
        //发送订单mq-给需要的调用方使用
        return null;
    }

    /**
     * 清除选中的下单商品列表
     * @param tradeDTO 交易视图
     */
    private void cleanChecked(TradeDTO tradeDTO) {

    }

    private void createTradeCheck(TradeDTO tradeDTO) {

    }

    private CartTypeEnum getCartType(String way) {
        return null;
    }
}
