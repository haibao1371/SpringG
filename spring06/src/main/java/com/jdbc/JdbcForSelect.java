package com.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.*;
import java.util.List;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: JdbcForSelect
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/317:46
 */
public class JdbcForSelect {
    //实例1：查询一个表有多少条记录
    @Test
    public void selectCount() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "root" );
        //创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
        //创建sql语句
        String sql = "select count(*) from mytable";
        int rows = jdbcTemplate.queryForObject( sql, Integer.class );
        System.out.println( rows );
    }

    //运用jdbc最原始代码实现对象的查询操作
    @Test
    public void selectJdbc() throws SQLException {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        //第1步：加载驱动
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            //第2步：创建数据库连接
            conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/db", "root", "root" );
            //第3步：编写SQL语句
            String sql = "select * from mytable where runoob_id=?";
            //第4步：预编译sql
            psmt = conn.prepareStatement( sql );
            //第5步：设置参数值
            psmt.setString( 1, "1" );
            //第6步：执行sql
            rs = psmt.executeQuery();
            //第7步：遍历结果集
            while (rs.next()) {
                String name = rs.getString( "runoob_title" );
                String author = rs.getString( "runoob_author" );
                System.out.println( "书名:" + name + "\n\t" + "作者:" + author );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //第8步：关闭数据源
            rs.close();
            conn.close();
            psmt.close();
        }
    }

    @Test
    //运用jdbcTemplate查询对象
    public void selectObject() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "root" );
        //创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
        //创建sql语句
        String sql = "select * from mytable where runoob_id=?";
        //调用JdbcTemplate的方法实现
        //第二个参数是接口RowMapper，在JdbcTemplate中没有其实现类，需要自己做数据封装
        Book bk = jdbcTemplate.queryForObject( sql, new MyRowMapper(), "1" );
        System.out.println( bk.toString() );
    }

    @Test
    //运用jdbcTemplate查询list
    public void selectList() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "root" );
        //创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
        //创建sql语句
        String sql = "select * from mytable";
        List<Book> list = jdbcTemplate.query( sql, new MyRowMapper() );
        System.out.println( list );
    }
}
