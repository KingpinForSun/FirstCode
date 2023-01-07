package com.msb.test05;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("aaa");
        list.add("1aaa");
        list.add("1aaa");
        list.add("aaa");

        System.out.println(list);

        list.remove("aaa");

        System.out.println(list);

        list.set(0,"eee");
        System.out.println(list);

        System.out.println(list.get(2));

    }
}
