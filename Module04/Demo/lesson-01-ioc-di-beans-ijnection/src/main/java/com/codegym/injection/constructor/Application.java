package com.codegym.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("constructor-injection.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        context.close();
    }


}
