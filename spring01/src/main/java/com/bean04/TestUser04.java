package com.bean04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser04
 * @ProjectName SpringG
 * @Description: TODO 测试用户04
 * @date 2019/7/113:49
 */
public class TestUser04 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean4.xml" );
        User04 user04 = (User04) context.getBean( "user04" );
        user04.print();
    }
}
