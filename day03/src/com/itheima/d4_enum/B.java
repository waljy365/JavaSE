package com.itheima.d4_enum;

/**
 * 枚举类实现单例
 *
 * @author : 王希辰
 * @date : 2023/2/28 11:32
 */
public enum B {
    OBJ("波仔",12);
    String name;
    int age;

    B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String show() {
        return "B{name = " + name + ", age = " + age + "}";
    }
}
