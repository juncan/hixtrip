package com.hixtrip.sample.infra.db.mapper;

import com.hixtrip.sample.domain.order.model.OrdOrderLog;
import org.springframework.stereotype.Repository;

/**
 * OrdOrderLogDAO继承基类
 */
@Repository
public interface OrdOrderLogDAO extends MyBatisBaseDao<OrdOrderLog, String> {
}