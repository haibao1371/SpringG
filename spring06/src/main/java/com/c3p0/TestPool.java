package com.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: TestPool
 * @ProjectName SpringG
 * @Description: TODO 原始代码实现C3p0连接池的操作
 * @date 2019/7/410:34
 */
public class TestPool {
    public static void main(String[] args) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass( "com.mysql.jdbc.Driver" );
        dataSource.setJdbcUrl( "jdbc:mysql://localhost:3306/db" );
        dataSource.setUser( "root" );
        dataSource.setPassword( "root" );
    }
}
