package com.itheima.d4_proxy;

import java.lang.reflect.Proxy;

/**
 * @author : 王希辰
 * @date : 2023/3/16 18:25
 */
public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        Star proxyStar = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, (proxy, method, args) -> {
            //参数1 代理对象,一般不用
            //参数2 代理调用的方法对象
            //参数3 代理调用方法的参数
            if ("sing".equals(method.getName())) {
                System.out.println("准备话筒");
            }
            if ("dance".equals(method.getName())) {
                System.out.println("准备场地");
            }
            return method.invoke(bigStar, args);
        });
        return proxyStar;
    }
}
