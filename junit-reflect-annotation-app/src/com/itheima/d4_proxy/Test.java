package com.itheima.d4_proxy;

/**
 * @author : 王希辰
 * @date : 2023/3/16 18:34
 */
public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("杨超越");
        Star proxy = ProxyUtil.createProxy(bigStar);
        System.out.println(proxy.sing("易燃易爆炸"));
        proxy.dance();
    }
}
