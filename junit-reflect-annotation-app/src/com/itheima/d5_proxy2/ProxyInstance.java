package com.itheima.d5_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : 王希辰
 * @date : 2023/3/17 9:21
 */
public class ProxyInstance implements InvocationHandler {
    UserService userService;

    public ProxyInstance(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time1 = System.currentTimeMillis();
        Object invoke = method.invoke(userService, args);
        long time2 = System.currentTimeMillis();
        System.out.println("deleteUsers方法耗时："+(time2-time1));
        return invoke;
    }
}
