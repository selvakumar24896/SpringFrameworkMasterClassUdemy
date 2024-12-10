package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());

//    execution(* PACKAGE.*.*(..))

//    execution: This is the keyword that defines the type of pointcut. The execution keyword is used to match method execution join points.
//
//    (* com.in28minutes.spring.aop.springaop.business.*.*(..))
//
//    * (return type): This indicates that any return type will match (e.g., void, String, int, etc.).
//    com.in28minutes.spring.aop.springaop.business: This specifies the package where the target classes reside.
//    .* (class): The .* after the package name matches any class within the business package.
//    .*(..) (method): This part matches any method name in any class in the specified package, with any parameters.

    @Before("execution(* com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Service.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("checking for user access");
        logger.info("Allowed execution for : {}", joinPoint);
    }
}
