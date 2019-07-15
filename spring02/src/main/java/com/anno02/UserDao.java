package com.anno02;

import org.springframework.stereotype.Component;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserDao
 * @ProjectName SpringG
 * @Description: TODO 创建Dao对象
 * @date 2019/7/118:56
 */
@Component(value = "userDao")
public class UserDao {
    public void add() {
        System.out.println( "dao........" );
    }
}
