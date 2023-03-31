package com.itheima.d14_extends_constructor;

/**
 * @author : 王希辰
 * @date : 2023/2/25 16:45
 */
public class People {
    private String name;
    private int age;


    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{name = " + name + ", age = " + age + "}";
    }
}
