package com.jdbc;

/**
 * 类注释
 *
 * @author Lenovo
 * @Title: Book
 * @ProjectName SpringG
 * @Description: TODO 写一个Book对象
 * @date 2019/7/318:30
 */
public class Book {
    private String name;
    private String author;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book:" + "[" + name + "," + author + "]";
    }
}
