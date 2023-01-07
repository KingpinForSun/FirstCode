package test01;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement sta = conn.createStatement();

        int i = sta.executeUpdate("INSERT INTO t_book (id,name,author,price) VALUES (2,'活着','余华',45);\n");

        if (i > 0) {
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }

        sta.close();
        conn.close();
    }
}
