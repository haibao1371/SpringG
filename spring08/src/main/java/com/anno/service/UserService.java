package com.anno.service;

import com.anno.dao.UserDao;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/416:32
 */
@Transactional
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //实现两个用户之间转账流转的业务逻辑
    public void changeAccount() {
        userDao.lessSalary();
        //假设在此处发生异常，会出现这样的问题，汪拙的账户发生了减少2000元的动作，但是柳梦依账户确没有增加，这样的话会造成金额丢失
        int i = 10 / 0;//肯定会报错，测试后面增加操作不会被执行到
        userDao.moreSalary();
    }
}
