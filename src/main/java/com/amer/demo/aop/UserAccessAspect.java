package com.amer.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before(value = "execution(* com.amer.demo.service.business.*.*(..))")
    public void before(JoinPoint joinPoint)
    {
        logger.info("check for User Access....");
        logger.info("Allowed Excution for {}" , joinPoint);
    }

}
