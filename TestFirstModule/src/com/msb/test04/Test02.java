package com.msb.test04;

public class Test02 {
    public static void main(String[] args) {
        try {
            devide();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void devide() throws Exception {
        int a = 12;
        int b = 0;
        if (b == 0){
//            try {
//                throw new Exception();
//            } catch (Exception e) {
//                System.out.println("这里的异常自行处理");
//            }

            throw new Exception();
        } else {

            System.out.println("两个数的商是" + a/b);
        }
    }
}
