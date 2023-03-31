package com.itheima.d1_polymorphism;

/**
 * @author : 王希辰
 * @date : 2023/2/25 17:51
 */
public class Student extends People{
    String name = "Student 变量";
    @Override
    public void run() {
        System.out.println("学生跑得快");
    }
    public void  study() {
        System.out.println("学习");
    }
}
