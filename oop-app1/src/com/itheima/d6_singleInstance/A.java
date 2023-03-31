package com.itheima.d6_singleInstance;

/**
 * @author : 王希辰
 * @date : 2023/2/25 9:13
 */
public class A {
    //2.定义一个类变量记住类的一个对象。
    private static A a = new A();

    //1.构造器私有
    private A() {

    }
    //3.定义一个类方法，返回对象。
    public static A getA() {
        return a;
    }

}
