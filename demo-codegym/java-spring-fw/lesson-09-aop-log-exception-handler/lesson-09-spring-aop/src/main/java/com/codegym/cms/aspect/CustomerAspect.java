package com.codegym.cms.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class CustomerAspect {

    @Before(value = "executeController()")
    public void beforeExecuteController() {
        System.out.println("Before Controller");
    }

    @After(value = "executeController()")
    public void afterExecuteController() {
        System.out.println("After Controller");
    }

    @Pointcut(value = "within(com.codegym.cms.controller.*), " +
                        "within(com.codegym.cms.service.*)")
    public void executeController() {
    }

}
