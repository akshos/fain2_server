package com.fain.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String agrs[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Stub stubObj = (Stub) context.getBean("stubBean");
        System.out.println("Message : " + stubObj.getMessage());
    }
}

