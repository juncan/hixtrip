package com.hixtrip.sample.domain.inventory.repository;

import com.hixtrip.sample.domain.goods.vo.GoodsSkuItemVO;

import java.util.List;

/**
 *
 */
public interface InventoryRepository {


    void deductStock(List<GoodsSkuItemVO> goodsSkuItemList);
}
