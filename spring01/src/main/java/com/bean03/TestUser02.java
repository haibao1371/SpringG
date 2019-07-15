package com.bean03;

import com.bean01.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestUser02
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/6/2718:12
 */
public class TestUser02 {
    public static void main(String[] args){
        //1.加载spring配置文件并创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext( "bean3.xml" );
        //2.得到配置创建的对象
        User02 user02= (User02) context.getBean( "user02" );
        System.out.println( user02 );
        user02.add();
    }
}
