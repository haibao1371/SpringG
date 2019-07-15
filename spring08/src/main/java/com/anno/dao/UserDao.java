package com.anno.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserDao
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/416:32
 */
public class UserDao {
    //注入JdbcTemplate的对象
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //去实现相应的工资减少1000方法
    public void lessSalary() {
        String sql = "update account set salary=salary-? where username=?";
        jdbcTemplate.update( sql, "2000", "汪拙" );
    }

    //去实现相应的工资增加1000的方法
    public void moreSalary() {
        String sql = "update account set salary=salary+? where username=?";
        jdbcTemplate.update( sql, "2000", "柳梦依" );
    }
}
