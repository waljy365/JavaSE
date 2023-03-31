package com.itheima.d5_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : 王希辰
 * @date : 2023/3/17 9:08
 */
public class ProxyUtil {
    public static UserService createProxy(UserService userService) {
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), userService.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                if ("login".equals(method.getName()) ||
                        "deleteUsers".equals(method.getName()) ||
                        "selectUsers".equals(method.getName())) {
                    long time1 = System.currentTimeMillis();
                    result = method.invoke(userService, args);
                    long time2 = System.currentTimeMillis();
                    System.out.println("deleteUsers方法耗时："+(time2-time1));
                }
                return result;
            }
        });
        return proxyInstance;
    }
}
