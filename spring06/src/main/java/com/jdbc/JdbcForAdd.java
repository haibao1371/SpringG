package com.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: JdbcForAdd
 * @ProjectName SpringG
 * @Description: TODO 运用数据库进行增加操作
 * @date 2019/7/311:08
 */
public class JdbcForAdd {
    @Test
    //1.添加操作
    public void add() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "root" );
        //创建jdbcTemplate对象，并且设置数据源
        JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
        //调用jdbcTemplate里面的方法完成增加操作
        //创建Sql语句
        String sql = "INSERT INTO db.mytable (runoob_id, runoob_title, runoob_author, submission_date) VALUES (?,?,?,?)";
        int rows = jdbcTemplate.update( sql, 5, "java", "李兴华", "2019-07-03" );
        System.out.println( rows );
    }

    //修改操作update
    @Test
    public void update() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "root" );
        //创建jdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
        //调用JdbcTemplate类中的update方法实现更新
        String sql = "UPDATE db.mytable SET runoob_title = '西游记', runoob_author = ?, submission_date = ?  WHERE runoob_id = 1";
        int rows = jdbcTemplate.update( sql, "孙悟空", "1001-01-01" );
        System.out.println( rows );
    }

    //删除操作
    @Test
    public void delete() {
        //设置数据库信息
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSource.setUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUsername( "root" );
        dataSource.setPassword( "root" );
        //创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate( dataSource );
        //声明要执行的sql
        String sql = "delete from  db.mytable where runoob_author=?";
        //调用update方法
        int rows = jdbcTemplate.update( sql, "李兴华" );
        System.out.println( rows );
    }
}
