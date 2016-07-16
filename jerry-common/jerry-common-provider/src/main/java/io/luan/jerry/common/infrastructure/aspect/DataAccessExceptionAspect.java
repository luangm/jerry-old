package io.luan.jerry.common.infrastructure.aspect;

import io.luan.jerry.common.domain.exception.JerryException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

/**
 * @author Guangmiao Luan
 * @since 7/16/2016.
 */
@Aspect
@Component
@Slf4j
public class DataAccessExceptionAspect implements Ordered {

    public DataAccessExceptionAspect() {
        System.out.println("DataAccessExceptionAspect created");
    }

    @Around("execution(* io.luan.jerry.*.domain.*.impl.*Impl.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("------" + pjp.toShortString() + "------");
        try {
            return pjp.proceed();
        } catch (DataAccessException e) {
            log.error(e.getMessage());
            throw new JerryException(e.getMessage());
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
