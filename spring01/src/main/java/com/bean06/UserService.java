package com.bean06;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserService
 * @ProjectName SpringG
 * @Description: TODO 创建用户服务
 * @date 2019/7/114:18
 */
public class UserService {
    //1.定义UserDao类型的属性
    private UserDao userDao;

    //2.生成其set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println( "service......." );
        userDao.add();
    }
}
