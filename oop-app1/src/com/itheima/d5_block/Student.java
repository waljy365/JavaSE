package com.itheima.d5_block;

/**
 * @author : 王希辰
 * @date : 2023/2/24 15:40
 */
public class Student {
    double score;
    static String name="1111";
    //静态代码块
    static {
        System.out.println("静态代码块======"+name);
        name = "wxc";

        System.out.println("静态代码块======"+name);
    }
    //实例代码块
    {
        name = "wxc";

        System.out.println("实例代码块====="+name);
    }
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        // 类方法中可以直接访问类的成员，不可以直接访问实例成员
        System.out.println(name);
        // System.out.println(score);报错
        //类方法中不可以出现this关键字的
        // System.out.println(this);//报错
    }
    //实例方法
    public void printScore() {
        System.out.println("成绩："+(score>60?"及格":"不及格"));
        // 实例方法中既可以直接访问类成员，也可以直接访问实例成员。
        System.out.println(name);
        System.out.println(score);
        //实例方法中可以出现this关键字
        System.out.println(this);
    }

}
