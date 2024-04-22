package com.hixtrip.sample.infra.db.mapper;

import com.hixtrip.sample.domain.order.model.OrdTrade;
import org.springframework.stereotype.Repository;

/**
 * OrdTradeDAO继承基类
 */
@Repository
public interface OrdTradeDAO extends MyBatisBaseDao<OrdTrade, String> {
}