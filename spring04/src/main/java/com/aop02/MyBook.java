package com.aop02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: MyBook
 * @ProjectName SpringG
 * @Description: TODO
 * @date 2019/7/216:34
 */
@Aspect
public class MyBook {
    //前置增强
    //在方法上面使用注解完成增强配置
    @Before( value = "execution(* com.aop02.Book.*(..))")
    public void before1() {
        System.out.println( "方法增强before" );
    }

    //后置增强
    @After( value = "execution(* com.aop02.Book.*(..))")
    public void after1() {
        System.out.println( "方法增强after" );
    }

    //环绕通知
    @Around(  value = "execution(* com.aop02.Book.*(..))")
    public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法之前
        System.out.println( "方法之前" );
        proceedingJoinPoint.proceed();
        //方法之后
        System.out.println( "方法之后" );
    }
}
