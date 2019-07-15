package com.aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestBook
 * @ProjectName SpringG
 * @Description: TODO 测试下Aop
 * @date 2019/7/214:40
 */
public class TestBook {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean1.xml" );
        Book book = (Book) context.getBean( "book" );
        book.add();
    }
}
