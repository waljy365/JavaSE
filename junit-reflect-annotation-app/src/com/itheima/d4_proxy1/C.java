package com.itheima.d4_proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : 王希辰
 * @date : 2023/3/16 19:45
 */
public class C implements InvocationHandler {
    private B b;

    public C(B b) {
        this.b = b;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我实现了InvocationHandler");
        method.invoke(b);
        return "调用了invoke";
    }
}
