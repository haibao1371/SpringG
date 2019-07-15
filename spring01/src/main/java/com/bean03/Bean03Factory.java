package com.bean03;

import com.bean01.User;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: Bean03Factory
 * @ProjectName SpringG
 * @Description: 实例工厂
 * @date 2019/6/2718:09
 */
public class Bean03Factory {
    public User02 getUser02() {
        return new User02();
    }
}
