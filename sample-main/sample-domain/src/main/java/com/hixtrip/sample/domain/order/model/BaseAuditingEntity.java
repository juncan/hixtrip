package com.hixtrip.sample.domain.order.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础审计实体
 *
 * @author xingkong
 */
@Getter
@Setter
public class BaseAuditingEntity implements Serializable {
    private static final long serialVersionUID = -5299422971927728955L;
    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;


}
