package com.bean01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser
 * @ProjectName SpringG
 * @Description: TODO 测试User类的创建
 * @date 2019/6/2717:05
 */
public class TestUser {
    public static void main(String[] args) {
        //1.加载spring配置文件并创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean1.xml" );
        //2.得到配置创建的对象
        User user = (User) context.getBean( "user" );
        User user01= (User) context.getBean( "user" );
        System.out.println( user );
        System.out.println(user01);
      //  user.add();
    }
}
