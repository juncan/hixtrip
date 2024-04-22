package com.hixtrip.sample.app.core;

import com.hixtrip.sample.app.core.annotaion.Idempotent;
import org.aspectj.lang.JoinPoint;

/**
 * @author xingkong
 */
public interface KeyResolver {
    /**
     * 解析处理 key
     *
     * @param idempotent 接口注解标识
     * @param point      接口切点信息
     * @return 处理结果
     */
    String resolver(Idempotent idempotent, JoinPoint point);
}
