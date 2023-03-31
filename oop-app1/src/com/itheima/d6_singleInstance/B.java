package com.itheima.d6_singleInstance;

/**
 * @author : 王希辰
 * @date : 2023/2/25 9:13
 */
public class B {
    //2.定义一个类变量存储类的一个对象。
    private static B b ;

    //1.构造器私有
    private B() {

    }
    //3.定义一个类方法创建并返回对象。
    public static B getB() {
        if (b == null) {
            b = new B();
        }
        return b;
    }

}
