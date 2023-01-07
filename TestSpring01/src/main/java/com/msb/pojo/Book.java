package com.msb.pojo;

public class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        System.out.println("book的有参构造器");
        this.id = id;
        this.name = name;
    }

    public Book() {
        System.out.println("book类空构造器");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("id的set方法");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name的set方法");
        this.name = name;
    }
}
