package com.itheima.d2_staticmethor;

/**
 * @author : 王希辰
 * @date : 2023/2/24 15:40
 */
public class Student {
    double score;
    //类方法
    public static void printHelloWorld() {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
    //实例方法
    public void printScore() {
        System.out.println("成绩："+(score>60?"及格":"不及格"));
    }
}
