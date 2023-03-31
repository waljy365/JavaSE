package com.itheima.d1_polymorphism;

/**
 * @author : 王希辰
 * @date : 2023/2/25 17:53
 */
public class Teacher extends People {
    String name = "Teacher 变量";
    @Override
    public void run() {
        System.out.println("老师跑的慢");
    }
    public void teach() {
        System.out.println("授课");
    }
}
