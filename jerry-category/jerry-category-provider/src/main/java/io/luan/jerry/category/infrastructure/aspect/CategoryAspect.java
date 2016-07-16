package io.luan.jerry.category.infrastructure.aspect;

import io.luan.jerry.common.domain.exception.JerryException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.dao.DataAccessException;

/**
 * @author Miao
 * @since 7/16/2016.
 */
@Aspect
@Slf4j
public class CategoryAspect {

    public CategoryAspect() {
        System.out.println("CategoryAspect created");
    }

    //@Around("execution(* io.luan.jerry.category.domain.*.*.*(..))")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("------" + pjp.toShortString() + "------");
        try {
            return pjp.proceed();
        } catch (DataAccessException e) {
            log.error(e.getMessage());
            throw new JerryException(e);
        }
    }
//
//    @Override
//    public int getOrder() {
//        return 1;
//    }
}
