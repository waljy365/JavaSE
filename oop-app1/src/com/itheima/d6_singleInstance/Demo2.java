package com.itheima.d6_singleInstance;

/**
 * @author : 王希辰
 * @date : 2023/2/25 10:02
 */
public class Demo2 {
    public static void main(String[] args) {
        B b = B.getB();
        B b1= B.getB();
        System.out.println(b);
        System.out.println(b1);
    }
}
