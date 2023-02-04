package com.msb.test09;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //输出矩形
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出图形层数：");
        int numi = scanner.nextInt();

//        for (int i = 1; i < numi; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //输出三角形
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
