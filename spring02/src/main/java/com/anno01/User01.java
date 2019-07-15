package com.anno01;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: User01
 * @ProjectName SpringG
 * @Description: TODO 类上面加注解的简单使用
 * @date 2019/7/118:19
 */
@Component(value = "user01")//这行注解就等价于<bean id="user01" class="com.anno01.User01"/>
@Scope(value = "prototype")//不写此注解代表是单实例，写上就是多实例
public class User01 {
    public void add(){
        System.out.println("add......");
    }
}
