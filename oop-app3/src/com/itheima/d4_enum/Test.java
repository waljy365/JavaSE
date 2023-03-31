package com.itheima.d4_enum;

/**
 * @author : 王希辰
 * @date : 2023/2/27 10:36
 */
public class Test {
    public static void main(String[] args) {
        //目标：认识枚举类
        //A.X=null;
        A a1 = A.X;
        A a2 = A.Y;
        A a3 = A.Z;
        System.out.println(a2.ordinal());
    }
}
