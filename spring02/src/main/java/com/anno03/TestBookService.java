package com.anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestBookService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/119:32
 */
public class TestBookService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean2.xml" );
        BookService bookService = (BookService) context.getBean( "bookService" );
        bookService.add();
    }
}
