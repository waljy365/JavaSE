package com.itheima.d12_extends_override;

/**
 * @author : 王希辰
 * @date : 2023/2/25 14:54
 */
public class Demo1 {
    public static void main(String[] args) {
        B va = new B();
        va.print1();
        Object o = new Object();
        System.out.println(o.getClass().getName());
    }
}
