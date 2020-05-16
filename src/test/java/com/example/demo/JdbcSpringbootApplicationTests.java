package com.example.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo.mapper.MsgMapper;
import com.example.demo.pojo.Msg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class JdbcSpringbootApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());

        //关闭连接
        connection.close();
    }

    @Autowired
    MsgMapper msgMapper;
    @Test
    void maba(){

        List<Msg> departments = msgMapper.getDepartments();

        for (Msg dd:departments) {
            System.out.println(dd);

        }
        System.out.println();


    }

}
