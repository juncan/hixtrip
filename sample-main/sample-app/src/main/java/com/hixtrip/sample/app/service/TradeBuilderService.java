package com.hixtrip.sample.app.service;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;
import com.hixtrip.sample.client.order.enums.CartTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 交易构造服务
 * @author xingkong
 */
@Service
@Slf4j
public class TradeBuilderService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private List<CartRenderStep> cartRenderSteps;

    /**
     * 获取整笔交易
     *
     * @param checkedWay 购物车类型
     * @return 购物车视图
     */
    public TradeDTO readDTO(CartTypeEnum checkedWay) {
        TradeDTO tradeDTO = (TradeDTO) redisTemplate.opsForValue().get(this.getOriginKey(checkedWay));
        if (tradeDTO == null) {
            tradeDTO = new TradeDTO(checkedWay);
            //根据登录用户id会员信息详情-设置到交易视图中

            tradeDTO.setMemberId(1l);
            tradeDTO.setMemberName("xingkong");
            tradeDTO.setMemberPhone("18612345678");
        }
        return tradeDTO;
    }

    private Object getOriginKey(CartTypeEnum cartTypeEnum) {
        //缓存key，默认使用购物车
        //登录的用户Id
        Long userId = 0L;
        return cartTypeEnum.getPrefix() +userId;
    }

    public void renderCartBySteps(TradeDTO tradeDTO, TradeRenderStepEnums[] checkedRender) {
        for (TradeRenderStepEnums step : checkedRender) {
            for (CartRenderStep render : cartRenderSteps) {
                if (render.step().equals(step)) {
                    render.render(tradeDTO);
                }
            }
        }
    }
}
