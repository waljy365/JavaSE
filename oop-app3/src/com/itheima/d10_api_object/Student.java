package com.itheima.d10_api_object;

import java.util.Objects;

/**
 * @author : 王希辰
 * @date : 2023/2/27 13:07
 */
public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        //判断两个对象地址是否一样
        if (this == o) return true;
        //判断是否为空，或者两个类型不同
        if (o == null || getClass() != o.getClass()) return false;
        //是student类型
        Student student = (Student) o;
        //判断年龄，
        return Objects.equals(age,student.age) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student() {
    }

    public Student(String name, int age) {
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
