package com.anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: UserService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/118:56
 */
@Service(value = "userService")
public class UserService {
    //得到UserDao
    //1.定义UserDao类型属性,在UserDao属性上面使用注解完成对象注入
//    @Autowired//使用注解方式无需使用set方法
    @Resource(name = "userDao")//name属性值写注解创建UserDao对象的Value值
    private UserDao userDao;
    public void add(){
        System.out.println("service......");
        userDao.add();
    }
}
