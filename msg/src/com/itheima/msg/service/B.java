package com.itheima.msg.service;

/**
 * @author : 王希辰
 * @date : 2023/2/27 9:03
 */
public abstract class B {

    private String name;
    private int age;

    public B() {
    }

    public B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printNameAge(){
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        printSkill();
    }
    public abstract void printSkill();

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

    public String toString() {
        return "B{name = " + name + ", age = " + age + "}";
    }
}
