package com.itheima.d1_polymorphism;

/**
 * @author : 王希辰
 * @date : 2023/2/25 17:54
 */
public class Demo1 {
    public static void main(String[] args) {
        //变量没有多态
        People p1 = new People();
        p1.run();
        System.out.println(p1.name);
        People p2 = new Student();
        p2.run();
        System.out.println(p2.name);
        People p3 = new Teacher();
        System.out.println(p3.name);
        p3.run();
    }
}
