package com.itheima.d14_extends_constructor;

/**
 * @author : 王希辰
 * @date : 2023/2/25 17:09
 */
public class Demo3 {
    public static void main(String[] args) {
        student student = new student("we",12);
        System.out.println(student);
    }
}

class student {
    private String name;
    private int age;
    private String schoolName;

    public student() {
    }

    public student(String name, int age) {
        // super();
        this(name, age, "大学");
    }
    public student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;

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

    /**
     * 获取
     * @return schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置
     * @param schoolName
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + ", schoolName = " + schoolName + "}";
    }
}
