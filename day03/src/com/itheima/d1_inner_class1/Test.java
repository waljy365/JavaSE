package com.itheima.d1_inner_class1;

/**
 * @author : 王希辰
 * @date : 2023/2/28 9:48
 */
public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner inner = new Outer().new Inner();
        inner.test();
    }
}
