package com.msb.test07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        while (true) {
//        打印菜单
            System.out.println("------欢迎来到【书城】---------");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            System.out.println("------------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输出对应功能编号：");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("当前定位》》》》》》1.展示书籍");
                for (int i = 0; i <= list.size() - 1; i++) {
                    Book b = (Book) (list.get(i));
                    System.out.println(b.getIndex() + "---" + b.getName() + "---" + b.getAuthor());

                }
            }

            if (choice == 2) {
                System.out.println("当前定位》》》》》》2.上新书籍");
                System.out.println("请录入书籍编号：");
                int bno = sc.nextInt();
                System.out.println("请录入书籍名称：");
                String bName = sc.next();
                System.out.println("请录入书籍作者：");
                String bAuthor = sc.next();

                Book b = new Book();
                b.setIndex(bno);
                b.setName(bName);
                b.setAuthor(bAuthor);

                //创建集合，用于存放相同个体

                list.add(b);

            }
            if (choice == 3) {
                System.out.println("当前定位》》》》》》3.下架书籍");
                System.out.println("录入要下架的书籍编号：");
                int delNum = sc.nextInt();
                for (int i = 0; i <= list.size() - 1; i++) {
                    Book b = (Book) (list.get(i));
                    if (b.getIndex() == delNum) {
                        list.remove(b);
                        System.out.println("书籍下架成功！");
                        break;
                    }

                }
            }
            if (choice == 4) {
                System.out.println("当前定位》》》》》》4.退出应用");
                break;
            }
        }
    }
}
