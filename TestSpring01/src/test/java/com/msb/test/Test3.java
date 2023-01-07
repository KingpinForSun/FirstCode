package com.msb.test;

import com.msb.pojo.Girl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Girl g = (Girl) context.getBean("girl");
        System.out.println("girl's name is " + g.getName() + " ,girl's boyfriend's name is " + g.getBoyfriend().getName());
    }
}
