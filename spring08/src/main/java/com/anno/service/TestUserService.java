package com.anno.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUserService
 * @ProjectName SpringG
 * @Description: TODO 验证下事务的功能
 * @date 2019/7/416:46
 */
public class TestUserService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean1.xml" );
        UserService userService = (UserService) context.getBean( "userService" );
        userService.changeAccount();
    }
}
