package com.msb.test08;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main---" + i);
        }

        TestThread t = new TestThread();

        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main--main---" + i);
        }
    }
}
