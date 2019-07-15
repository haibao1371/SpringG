package com.bean07;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: User07
 * @ProjectName SpringG
 * @Description: TODO P名称空间注入
 * @date 2019/7/115:23
 */
public class User07 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println( "name:" + name );
    }
}
