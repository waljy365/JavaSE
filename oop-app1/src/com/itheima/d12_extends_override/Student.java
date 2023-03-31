package com.itheima.d12_extends_override;

/**
 * @author : 王希辰
 * @date : 2023/2/25 15:14
 */
public class Student {
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
