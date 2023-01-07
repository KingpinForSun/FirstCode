package com.msb.test;

import com.msb.pojo.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //create spring servlet
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Book book = (Book)context.getBean("b");
        Book book = (Book)context.getBean("b2");

        System.out.println(book.getName() + "---" + book.getId());


    }
}
