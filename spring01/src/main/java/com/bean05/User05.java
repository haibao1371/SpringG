package com.bean05;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: User05
 * @ProjectName SpringG
 * @Description: TODO 使用Set方法注入属性
 * @date 2019/7/113:59
 */
public class User05 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println( "姓名:" + name );
    }
}
