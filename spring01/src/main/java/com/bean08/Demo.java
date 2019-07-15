package com.bean08;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: Demo
 * @ProjectName SpringG
 * @Description: TODO 运用Set方法注入复杂类型的属性
 * @date 2019/7/115:35
 */
public class Demo {
    private String[] arrs;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void print() {
        System.out.println( "arrays:" + arrs.toString() );
        System.out.println( "List:" + list );
        System.out.println( "Map:" + map );
        System.out.println( "Properties:" + properties );
    }
}
