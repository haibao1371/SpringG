package com.anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: Test
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/119:03
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean1.xml" );
        UserService userService = (UserService) context.getBean( "userService" );
        userService.add();
    }
}
