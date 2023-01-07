package com.msb.test02;

public class Test01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 18;
        p1.height = 170;
        p1.name = "lily";

        Person p2 = new Person("alice",20,170);
    }
}
