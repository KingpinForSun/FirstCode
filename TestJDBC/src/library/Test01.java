package library;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList list = new ArrayList();
        while (true) {
//        打印菜单
            System.out.println("------欢迎来到【书城】---------");
            System.out.println("1.查询书籍");
            System.out.println("2.展示书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            System.out.println("------------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输出对应功能编号：");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("当前定位》》》》》》1.查询书籍");
                System.out.println("请录入你想要查看的书籍的编号：");
                int bno = sc.nextInt();
                Book b = findBookByBno(bno);
                if(b == null) {
                    System.out.println("您想要查询的书籍不存在！");
                } else {
                    System.out.println("当前查询到一本书：《" + b.getName() + "》");
                }
            }

            if (choice == 2) {
                System.out.println("当前定位》》》》》》2.展示书籍");
                ArrayList books = findBooks();
                if (books.size() == 0){
                    System.out.println("没有查询到书籍");
                } else {
                    for (int i = 0; i < books.size(); i++) {
                        Book b = (Book) (books.get(i));
                        System.out.println(b.getIndex() + "---" + b.getName() + "---" + b.getAuthor() + "---" + b.getPrice());
                    }
                }


            }
            if (choice == 3) {
                System.out.println("当前定位》》》》》》3.下架书籍");
                System.out.println("录入要下架的书籍编号：");
                int delNum = sc.nextInt();
                int n = delBookByBno(delNum);
                if (n<=0){
                    System.out.println("删除失败！");
                } else {
                    System.out.println("删除成功！");
                }
            }
            if (choice == 4) {
                System.out.println("当前定位》》》》》》4.退出应用");
                break;
            }
        }
    }


    public static Book findBookByBno(int bno) throws ClassNotFoundException, SQLException {
        Book b = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement sta = conn.createStatement();

        ResultSet rs = sta.executeQuery("select * from t_book where id = " + bno);

        if (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");

            b = new Book();
            b.setIndex(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);
        }
        sta.close();
        conn.close();

        return b;
    }

    public static ArrayList findBooks() throws ClassNotFoundException, SQLException {
        ArrayList list = new ArrayList();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement sta = conn.createStatement();

        ResultSet rs = sta.executeQuery("select * from t_book");

        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");

            Book b = new Book();
            b.setIndex(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);

            list.add(b);
        }
        sta.close();
        conn.close();

        return list;
    }
    public static int delBookByBno(int bno) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement sta = conn.createStatement();

        int n = sta.executeUpdate("delete from t_book where id = " + bno);

        sta.close();
        conn.close();

        return n;
    }
}
