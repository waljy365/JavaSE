package com.itheima.d5_proxy2;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 目标：使用动态代理解决实际问题，并掌握使用代理的好处。
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 1、创建用户业务对象。
        UserService userService1 = new UserServiceImpl();
        // UserService userService = ProxyUtil.createProxy(userService1);
        ProxyInstance proxyInstance = new ProxyInstance(userService1);
        UserService userService = (UserService) Proxy.newProxyInstance(Test.class.getClassLoader(), userService1.getClass().getInterfaces(), proxyInstance);
        // 2、调用用户业务的功能。
        userService.login("admin", "123456");
        System.out.println("----------------------------------");

        userService.deleteUsers();
        System.out.println("----------------------------------");

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户是：" + Arrays.toString(names));
        System.out.println("----------------------------------");

    }
}
