package com.codegym.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Developer fs = (Developer) applicationContext.getBean("fullstack");
        System.out.println(fs);
        applicationContext.close();

    }
}
