package com.msb.test08;

public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("���߳�---" + i);
        }
    }
}
