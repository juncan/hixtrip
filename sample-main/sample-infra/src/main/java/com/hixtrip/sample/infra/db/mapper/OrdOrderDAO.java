package com.hixtrip.sample.infra.db.mapper;

import com.hixtrip.sample.domain.order.model.OrdOrder;
import org.springframework.stereotype.Repository;

/**
 * OrdOrderDAO继承基类
 */
@Repository
public interface OrdOrderDAO extends MyBatisBaseDao<OrdOrder, String> {
}