package com.wj.ajaxserver.entity;

/**
 * @创建人 wj
 * @创建时间 2018/11/23
 * @描述
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
