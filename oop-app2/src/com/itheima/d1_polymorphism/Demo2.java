package com.itheima.d1_polymorphism;

/**
 * @author : 王希辰
 * @date : 2023/2/26 9:23
 */
public class Demo2 {
    public static void main(String[] args) {
        // 好处1：代码解耦合
        Student s = new Student();
        go(s);
        Teacher t = new Teacher();
        go(t);
    }
    //好处2：方法形参 用父类类型 便于扩展 更加便利
    //坏处：不能调用子类的特色方法
    public static void go(People p) {
        System.out.println("开始");
        p.run();
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        }
        System.out.println("结束");
    }
}
