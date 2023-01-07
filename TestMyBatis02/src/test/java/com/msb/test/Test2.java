package com.msb.test;

import com.msb.mapper.BookMapper;
import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //指定核心配置文件的路径；
        String resource = "mybatis.xml";
        //获取加载配置文件的输入流；
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //加载配置文件，创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂类来获取一个会话：
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询：

        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
//        Book b = mapper.selectOneBook("项目驱动零起点学Java", "马士兵");
        Book b = new Book();
        b.setName("项目驱动零起点学Java");
        b.setAuthor("马士兵");
        //Book book = mapper.selectOneBook2(b);
        Book book = mapper.selectOneBook3("项目驱动零起点学Java", b);
        System.out.println(book.getPrice());

        //关闭资源
        sqlSession.close();
    }
}
