package com.itheima.d6_singleInstance;

/**
 * @author : 王希辰
 * @date : 2023/2/25 9:28
 */
public class Demo1 {
    public static void main(String[] args) {
        A a = A.getA();
        A a1 = A.getA();
        System.out.println(a);
        System.out.println(a1);
    }
}
