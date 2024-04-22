package com.hixtrip.sample.infra.db;

/**
 * 商品sku接口
 * @author xingkong
 */
public interface IGoodsSkuService {
    static String getStockCacheKey(Long id) {
        return "{SKU_STOCK}:" + id;
    }
}
