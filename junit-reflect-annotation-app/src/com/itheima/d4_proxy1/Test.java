package com.itheima.d4_proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author : 王希辰
 * @date : 2023/3/16 19:47
 */
public class Test {
    public static void main(String[] args) {
        B b = new B();
        InvocationHandler c = new C(b);
        System.out.println(Arrays.toString(b.getClass().getInterfaces()));
        //类加载器
        //主类加载器
        //平台类加载器
        //应用类加载器
        //自定义类加载器
        A a = (A) Proxy.newProxyInstance(c.getClass().getClassLoader(), b.getClass().getInterfaces(), c);
        a.test();
    }
}
