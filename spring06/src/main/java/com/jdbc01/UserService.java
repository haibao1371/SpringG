package com.jdbc01;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/411:18
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        userDao.add();
    }
}
