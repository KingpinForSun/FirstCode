package com.msb.test09;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //�������
        Scanner scanner = new Scanner(System.in);
        System.out.println("�����ͼ�β�����");
        int numi = scanner.nextInt();

//        for (int i = 1; i < numi; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //���������
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
