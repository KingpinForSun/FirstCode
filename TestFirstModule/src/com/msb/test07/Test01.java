package com.msb.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        while (true) {
//        ��ӡ�˵�
            System.out.println("------��ӭ��������ǡ�---------");
            System.out.println("1.չʾ�鼮");
            System.out.println("2.�����鼮");
            System.out.println("3.�¼��鼮");
            System.out.println("4.�˳�Ӧ��");
            System.out.println("------------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("�������Ӧ���ܱ�ţ�");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("��ǰ��λ������������1.չʾ�鼮");
                for (int i = 0; i <= list.size() - 1; i++) {
                    Book b = (Book) (list.get(i));
                    System.out.println(b.getIndex() + "---" + b.getName() + "---" + b.getAuthor());

                }
            }

            if (choice == 2) {
                System.out.println("��ǰ��λ������������2.�����鼮");
                System.out.println("��¼���鼮��ţ�");
                int bno = sc.nextInt();
                System.out.println("��¼���鼮���ƣ�");
                String bName = sc.next();
                System.out.println("��¼���鼮���ߣ�");
                String bAuthor = sc.next();

                Book b = new Book();
                b.setIndex(bno);
                b.setName(bName);
                b.setAuthor(bAuthor);

                //�������ϣ����ڴ����ͬ����

                list.add(b);

            }
            if (choice == 3) {
                System.out.println("��ǰ��λ������������3.�¼��鼮");
                System.out.println("¼��Ҫ�¼ܵ��鼮��ţ�");
                int delNum = sc.nextInt();
                for (int i = 0; i <= list.size() - 1; i++) {
                    Book b = (Book) (list.get(i));
                    if (b.getIndex() == delNum) {
                        list.remove(b);
                        System.out.println("�鼮�¼ܳɹ���");
                        break;
                    }

                }
            }
            if (choice == 4) {
                System.out.println("��ǰ��λ������������4.�˳�Ӧ��");
                break;
            }
        }
    }
}
