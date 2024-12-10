package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspectAfter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @After(
          value = "com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect.CommonPointCutConfig" +
                ".servicePointCut()")
    public void after(JoinPoint joinPoint) {
        logger.info("after aspect : {}", joinPoint);
    }

    @AfterReturning(
          value = "com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect.CommonPointCutConfig" +
                ".servicePointCut()",
          returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("{} after aspect returning : {}", joinPoint, result);
    }
}
