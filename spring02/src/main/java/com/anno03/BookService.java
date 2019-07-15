package com.anno03;

import javax.annotation.Resource;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: BookService
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/119:26
 */
public class BookService {
    @Resource(name = "bookDao")
    private BookDao bookDao;
    @Resource(name = "orderDao")
    private OrderDao orderDao;

    public void add() {
        System.out.println( "BookService......" );
        bookDao.add();
        orderDao.add();
    }
}
