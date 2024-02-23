package com.codegym.injection.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("setter-injection.xml");
        Clazz c06Clazz=(Clazz) context.getBean("clazz");
        System.out.println(c06Clazz);
        context.close();
    }

}
