package com.msb.test02;

public class Person {
    String name;

    int age;

    double height;

    public void study(){
        System.out.println("正在学习！");
    }

    public Person(){
        System.out.println("调用构造器");
    }

    public Person(String name,int age,int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
