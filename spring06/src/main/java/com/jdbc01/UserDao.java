package com.jdbc01;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserDao
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/411:18
 */
public class UserDao {
    //得到jdbcTemplate对象
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //添加操作
    public void add() {
        String sql = "INSERT INTO db.mytable (runoob_id, runoob_title, runoob_author, submission_date) VALUES (?,?,?,?)";
        int rows = jdbcTemplate.update( sql, 5, "海宝语录", "海哥", "2019-07-04" );
        System.out.println( rows );

    }
}
