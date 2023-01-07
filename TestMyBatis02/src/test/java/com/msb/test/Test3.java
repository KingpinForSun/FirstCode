package com.msb.test;

import com.msb.mapper.BookMapper;
import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //指定核心配置文件的路径；
        String resource = "mybatis.xml";
        //获取加载配置文件的输入流；
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //加载配置文件，创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂类来获取一个会话：
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book b = new Book();
        b.setId(3);
        b.setName("红高粱");
        b.setAuthor("莫言");
        b.setPrice(40);
        int i = mapper.insertBook(b);

        if (i>0){
            System.out.println("插入成功");
        } else {
            System.out.println("插入失败");
        }
        //和事务相关的操作：
        sqlSession.commit();

        sqlSession.close();
    }
}