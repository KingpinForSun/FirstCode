package test01;

import java.sql.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        Statement sta = conn.createStatement();

        ResultSet rs = sta.executeQuery("select * from t_book");

        while(rs.next()){
            System.out.println(rs.getInt("id") + "---" + rs.getString("name") + "---" + rs.getString("author") + "---" + rs.getDouble("price"));
        }
        sta.close();
        conn.close();
    }
}
