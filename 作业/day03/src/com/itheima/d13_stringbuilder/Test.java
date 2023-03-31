package com.itheima.d13_stringbuilder;

/**
 * @author : 王希辰
 * @date : 2023/2/27 16:01
 */
public class Test {
    public static void main(String[] args) {
        //StringBuilder用法
        StringBuilder s = new StringBuilder("heima");
        StringBuilder s2 = new StringBuilder();
        s2.append(12.23);//拼接
        s2.append("awdafg");
        s.append(12);
        System.out.println(s);
        System.out.println(s2);
        StringBuilder reverse = s.reverse();
        System.out.println("-----------");
        System.out.println(reverse);
        System.out.println(reverse.length());
        String s1 = reverse.toString();
        System.out.println(s1.getClass());
        //默认调StringBuilder的toString()
        System.out.println(reverse.toString());
        System.out.println(reverse.getClass());
        StringBuilder s3 = new StringBuilder();
        String s4 = s3.append("风浪越大").append("鱼越贵").append(666).append("gogo").toString();
        System.out.println(s4);
    }
}
