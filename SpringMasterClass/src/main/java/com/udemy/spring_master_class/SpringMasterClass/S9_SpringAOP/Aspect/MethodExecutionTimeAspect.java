package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class MethodExecutionTimeAspect {

    Logger logger = LoggerFactory.getLogger(MethodExecutionTimeAspect.class);

    @Around("com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect.CommonPointCutConfig.trackTimeAnnotation()")
    public void methodTimeTaken(ProceedingJoinPoint joinPoint) throws Throwable {
        long currentTimebefore = System.currentTimeMillis();
        joinPoint.proceed();
        long diff = System.currentTimeMillis() - currentTimebefore;

        logger.info("Time taken for {} is {}", joinPoint, currentTimebefore);
    }
}
