package com.bean05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser05
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/114:04
 */
public class TestUser05 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean5.xml" );
        User05 user05 = (User05) context.getBean( "user05" );
        user05.print();
    }
}
