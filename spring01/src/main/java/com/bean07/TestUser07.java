package com.bean07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser07
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/115:27
 */
public class TestUser07 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean7.xml" );
        User07 user07 = (User07) context.getBean( "user07" );
        user07.add();
    }
}
