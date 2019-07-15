package com.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: MyRowMapper
 * @ProjectName SpringG
 * @Description: TODO 实现JdbcTemplate中的RowMapper接口
 * @date 2019/7/318:31
 */
public class MyRowMapper implements RowMapper<Book> {
    //rs就是结果集，num就是最终返回的条数
    public Book mapRow(ResultSet rs, int num) throws SQLException {
        //第1步：从结果集里面得到数据
        String name = rs.getString( "runoob_title" );
        String author = rs.getString( "runoob_author" );
        //第2步：把得到的数据封装在对象里面
        Book book = new Book();
        book.setAuthor( author );
        book.setName( name );
        return book;
    }
}
