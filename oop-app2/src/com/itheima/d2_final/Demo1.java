package com.itheima.d2_final;

import java.util.Arrays;

/**
 * @author : 王希辰
 * @date : 2023/2/26 10:11
 */
public class Demo1 {
    public static void main(String[] args) {
        final int score = 100;//局部变量，赋值一次
        //score=99;
        double money = 99;
        pay(money);
        //注意事项
        final int age = 20;//final修饰的基础数据类型，数据不能变
        final int[] arr = {1, 2, 3};//final修饰的引用数据类型，地址不能变，对象内容可以变
        // arr=null;
        arr[2]=22;
        System.out.println(Arrays.toString(arr));
    }

    //场景
    public static void pay(final double money) {
        //money=1000;
    }


}


class Student {
    // public final String name="波仔";//实例变量，每个对象都有一份
    final static String schoolName = "黑马";//常量

}
//final 修饰类,这个类不能有子类
/*
final class A {

}

class B extends A {
}*/
//final修饰方法不能配重写
/*class A {
    public final void go() {

    }
}

class B extends A {
    @Override
    public void go() {
        super.go();
    }
}*/

