package com.bean02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser01
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/6/2718:00
 */
public class TestUser01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean2.xml" );
        User01 user01 = (User01) context.getBean( "user01" );
        System.out.println( user01 );
        user01.add();
    }
}
