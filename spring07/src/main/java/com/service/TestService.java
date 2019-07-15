package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/415:32
 */
public class TestService {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean1.xml" );
        OrderService orderService = (OrderService) context.getBean( "orderService" );
        orderService.accountMoney();
    }
}
