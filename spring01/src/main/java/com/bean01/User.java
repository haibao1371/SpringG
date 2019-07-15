package com.bean01;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: User
 * @ProjectName SpringG
 * @Description: TODO 创建一个类对象的原始做法
 * @date 2019/6/2716:42
 */
public class User {
    private int age;

    public User(int age) {
        this.age = age;
    }

    public User() {

    }

    public void add() {
        System.out.println( "add........" );
    }
}
