package com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    @Pointcut("execution(* com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Service.*.*(..))")
    public void servicePointCut(){

    }

    @Pointcut("execution(* com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Repository.*.*(..))")
    public void dataPointCut(){

    }

    @Pointcut("@annotation(com.udemy.spring_master_class.SpringMasterClass.S9_SpringAOP.Aspect.TrackTime)")
    public void trackTimeAnnotation(){

    }
}
