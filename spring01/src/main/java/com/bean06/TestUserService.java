package com.bean06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser06
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/114:35
 */
public class TestUserService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean6.xml" );
        UserService userService = (UserService) context.getBean( "userService" );
        userService.add();
    }
}
