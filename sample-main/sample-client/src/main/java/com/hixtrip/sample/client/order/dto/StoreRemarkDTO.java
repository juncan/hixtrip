package com.hixtrip.sample.client.order.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 店铺备注
 * @author xingkong
 */
@Data
public class StoreRemarkDTO implements Serializable {
    private static final long serialVersionUID = 7202019003766533095L;

    /**
     * 店铺id
     */
    private Long storeId;

    /**
     * 备注
     */
    private String remark;
}
