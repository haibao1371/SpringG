package com.service;

import com.dao.OrderDao;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: OrderService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/414:27
 */
public class OrderService {
    //注入OrderDao的对象
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    //调用dao的方法
    //业务逻辑层，写转账业务
    public void accountMoney() {
        //汪拙少1000
        orderDao.lessMoney();
//        //此时执行出现异常
        int i = 10 / 0;
        //柳梦依多1000
        orderDao.moreMoney();
    }
}
