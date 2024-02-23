package com.codegym.beans.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml-beans.xml");
        Developer fe = (Developer) applicationContext.getBean("frontend");
        System.out.println(fe);
        Developer be=(Developer) applicationContext.getBean("backend");
        System.out.println(be);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
