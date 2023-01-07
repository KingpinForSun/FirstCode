package com.msb.controller;

import com.msb.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test1")
    public String test1(){
        return "index.jsp";
    }

    @RequestMapping("/testParam")
    public String testParam(String name,int age){
        System.out.println(name + "----" + age);
        return "index.jsp";
    }

    @RequestMapping("/testParam2")
    public String testParam2(Person p){
        System.out.println(p.getAge() + "----" + p.getName());
        return "index.jsp";
    }
}
