package com.hixtrip.sample.app.service.render.impl;

import com.hixtrip.sample.app.service.render.CartRenderStep;
import com.hixtrip.sample.app.service.render.enums.TradeRenderStepEnums;
import com.hixtrip.sample.client.order.dto.TradeDTO;

/**
 * 商品有效期校验
 *
 * 1：判断商品信息有效性 - 通过查询db中的字段update_time和redis中存储的update_time做匹配
 * 2：判断商品状态
 * 3：判断商品开售时间
 * 4：售卖范围检测
 * 5：商品sku库存检测
 *
 *
 * @author xingkong
 */
public class CheckDataRender implements CartRenderStep {
    @Override
    public TradeRenderStepEnums step() {
        return TradeRenderStepEnums.CHECK_DATA;
    }

    @Override
    public void render(TradeDTO tradeDTO) {

    }
}
