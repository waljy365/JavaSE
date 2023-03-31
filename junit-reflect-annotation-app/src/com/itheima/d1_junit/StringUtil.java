package com.itheima.d1_junit;

/*
    字符串工具类
    需求 : 使用单元测试来测试工具类中两个方法
    1 断言
    2 常见注解
 */
public class StringUtil {

    public static void printNumber(String name) {
        System.out.println("名字长度是：" + name.length());
    }
    /*
      求字符串的最大索引
     */
    public static int getMaxIndex(String data) {
        if (data == null) {
            return -1;
        }
        return data.length()-1;
    }
}














