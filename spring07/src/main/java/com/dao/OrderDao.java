package com.dao;

import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: OrderDao
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/414:27
 */
public class OrderDao {
    //注入jdbcTemplate模板对象
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * @Description: TODO 针对数据库操作的方法，不写业务操作
     * @Param:
     * @return:
     * @Author: haibao.wang
     * @date: 2019/7/4
     */
    //汪拙少1000块钱的操作
    public void lessMoney() {
        String sql = "update account set salary = salary-? where username=?";
        jdbcTemplate.update( sql, "1000", "汪拙" );
    }

    //柳梦依多1000块钱的操作
    public void moreMoney() {
        String sql = "update account set salary = salary+? where username=?";
        jdbcTemplate.update( sql, "1000", "柳梦依" );
    }
}
