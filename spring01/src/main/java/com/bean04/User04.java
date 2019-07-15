package com.bean04;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: User04
 * @ProjectName SpringG
 * @Description: TODO 有参构造的方式注入属性
 * @date 2019/7/113:45
 */
public class User04 {
    private String name;
    public User04(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println("姓名:"+name);
    }
}
