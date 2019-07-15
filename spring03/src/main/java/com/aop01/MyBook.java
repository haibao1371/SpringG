package com.aop01;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: MyBook
 * @ProjectName SpringG
 * @Description: TODO 方法增强
 * @date 2019/7/214:14
 */
public class MyBook {
    //前置增强
    public void before1() {
        System.out.println( "方法增强before" );
    }

    //后置增强
    public void after1() {
        System.out.println( "方法增强after" );
    }

    //环绕通知
    public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法之前
        System.out.println( "方法之前" );
        proceedingJoinPoint.proceed();
        //方法之后
        System.out.println( "方法之后" );
    }
}
