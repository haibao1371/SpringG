package com.bean08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestDemo
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/115:47
 */
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean8.xml" );
        Demo demo = (Demo) context.getBean( "demo" );
        demo.print();
    }
}
