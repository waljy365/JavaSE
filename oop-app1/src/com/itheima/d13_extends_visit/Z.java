package com.itheima.d13_extends_visit;

/**
 * @author : 王希辰
 * @date : 2023/2/25 15:48
 */
public class Z extends F {
    public String name = "子类的成员变量";

    public void print1() {
        String name = "1111";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    @Override
    public void test1() {
        System.out.println("子类的方法");
    }
    public void print2() {
        test1();
    }
}
