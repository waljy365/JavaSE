package com.itheima.d1_staticdemo;

/**
 * @author : 王希辰
 * @date : 2023/2/24 15:05
 */
public class Demo1 {
    public static void main(String[] args) {
        //类变量（类名.类变量）
        Student.name="袁术";
        System.out.println(Student.name);
        Student s1 = new Student();
        //不推荐（对象名.类变量）
        s1.name = "吕布";
        System.out.println(Student.name);
        //实例变量（对象名.实例变量）
        Student s2 = new Student();
        s2.age=22;
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
