package com.itheima.homework;

/**
 * @author : 王希辰
 * @date : 2023/3/4 20:13
 */
public class Student {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (!gender.equals("男") && !gender.equals("女")) {
            throw new SexException("性别异常");
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15 || age > 50) {
            throw new AgeException("年龄异常");
        }
        this.age = age;
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
    }
}
