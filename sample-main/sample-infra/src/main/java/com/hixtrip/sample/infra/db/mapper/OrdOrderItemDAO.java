package com.hixtrip.sample.infra.db.mapper;

import com.hixtrip.sample.domain.order.model.OrdOrderItem;
import org.springframework.stereotype.Repository;

/**
 * OrdOrderItemDAO继承基类
 */
@Repository
public interface OrdOrderItemDAO extends MyBatisBaseDao<OrdOrderItem, String> {
}