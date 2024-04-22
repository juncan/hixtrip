package com.hixtrip.sample.app.core.aop;

import com.hixtrip.sample.app.core.KeyResolver;
import com.hixtrip.sample.app.core.annotaion.Idempotent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * 幂等
 * @author xingkong
 * @date 2024/4/22 16:38
 */
@Aspect
@Slf4j
public class IdempotentAspect {
    private final ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    private static final String CACHE_KEY = "base:idempotent:";

    private static final String KEY = "key";

    private static final String DELETE_KEY = "delKey";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Autowired
    private KeyResolver keyResolver;


    @Pointcut("@annotation( com.hixtrip.sample.app.core.annotaion.Idempotent)")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void beforePointCut(JoinPoint joinPoint) throws Exception {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        if (!method.isAnnotationPresent(Idempotent.class)) {
            return;
        }
        Idempotent idempotent = method.getAnnotation(Idempotent.class);

        //todo key的获取
        String key = CACHE_KEY + keyResolver.resolver(idempotent, joinPoint);

        long expireTime = idempotent.expireTime();
        String info = idempotent.info();
        TimeUnit timeUnit = idempotent.timeUnit();
        boolean deleteKey = idempotent.deleteKey();

        if (Objects.equals(stringRedisTemplate.hasKey(key), Boolean.TRUE)) {
            // had stored
            throw new RuntimeException(info);
        }

        String value = LocalDateTime.now().toString().replace("T", " ");

        Boolean success = stringRedisTemplate.opsForValue().setIfAbsent(key, value, expireTime, timeUnit);
        if (Objects.equals(success, Boolean.FALSE)) {
            throw new RuntimeException(info);
        } else {
            log.info("[idempotent]:has stored key={},value={},expireTime={}{},now={}", key, value, expireTime, timeUnit, LocalDateTime.now());
        }

        Map<String, Object> map = CollectionUtils.isEmpty(threadLocal.get()) ? new HashMap<>(4) : threadLocal.get();
        map.put(KEY, key);
        map.put(DELETE_KEY, deleteKey);
        threadLocal.set(map);
    }

    @After("pointCut()")
    public void afterPointCut(JoinPoint joinPoint) {
        Map<String, Object> map = threadLocal.get();
        if (CollectionUtils.isEmpty(map)) {
            return;
        }

        String key = map.get(KEY).toString();

        boolean delKey = (boolean) map.get(DELETE_KEY);
        if (delKey) {
            stringRedisTemplate.delete(key);
            log.info("[idempotent]:has removed key={}", key);
        }
        threadLocal.remove();
    }

}
