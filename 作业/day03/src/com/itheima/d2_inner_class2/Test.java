package com.itheima.d2_inner_class2;

/**
 * @author : 王希辰
 * @date : 2023/2/28 10:05
 */
public class Test {
    public static void main(String[] args) {
        // Outer.Inner inner = new Outer.Inner();
        // inner.test();
        // Outer.Inner.test1();
        Integer i1=new Integer(127);
        System.out.println();
        Integer i2=new Integer(127);
        Integer i3=new Integer(128);
        Integer i4=new Integer(128);
        //Integer i2=127;
        System.out.println(i1==i2);//true
        //Integer i3=128;
        // Integer i4=128;
        System.out.println(i3==i4);

    }
}
