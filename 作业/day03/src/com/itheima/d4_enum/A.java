package com.itheima.d4_enum;

/**
 * 枚举类
 *
 * @author : 王希辰
 * @date : 2023/2/28 11:29
 */
public enum A {
    X,Y,Z;//枚举类常量 第一行只能写 对象名称
    String name;
    int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
