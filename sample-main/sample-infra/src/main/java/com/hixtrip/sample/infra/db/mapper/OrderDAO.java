package com.hixtrip.sample.infra.db.mapper;

import com.hixtrip.sample.domain.order.model.Order;
import org.springframework.stereotype.Repository;

/**
 * OrderDAO继承基类
 */
@Repository
public interface OrderDAO extends MyBatisBaseDao<Order, Long> {
}