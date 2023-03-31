package com.itheima.d7_extends;

/**
 * @author : 王希辰
 * @date : 2023/2/25 10:49
 */
public class B extends A{

    public void print3() {
        //可以访问父类非私有成员
        System.out.println(i);
        print1();
        //不能访问私有
        // System.out.println(j);
        // print2();
        System.out.println(name);
        print4();
    }
}
