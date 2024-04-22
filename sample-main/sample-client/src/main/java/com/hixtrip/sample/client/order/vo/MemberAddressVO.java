package com.hixtrip.sample.client.order.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serial;
import java.io.Serializable;

/**
 * 用户收货地址
 * @author xingkong
 */
@Data
public class MemberAddressVO implements Serializable {
    private static final long serialVersionUID = 2904338996008151483L;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 收货人Id
     */
    private Long addressId;

    /**
     * 收货人姓名
     */
    private String name;

    /**
     * 手机号码
     * todo 可以做加密返回
     */
    private String mobile;

    /**
     * 详细地址
     */
    @NotEmpty(message = "详细地址不能为空")
    private String detail;

    /**
     * 地址code，'，'分割
     */
    @NotBlank(message = "地址不能为空")
    private String addressCode;

    /**
     * 地址名称， '，'分割
     */
    @NotBlank(message = "地址不能为空")
    private String addressPath;

    /**
     * 是否为默认收货地址
     */
    private Boolean isDefault;

    /**
     * 地址别名
     */
    private String alias;

    /**
     * 经度
     */
    private String lon;

    /**
     * 纬度
     */
    private String lat;
}
