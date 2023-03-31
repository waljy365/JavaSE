package com.itheima.d13_stringbuilder;

/**
 * @author : 王希辰
 * @date : 2023/2/27 16:10
 */
public class Test1 {
    public static void main(String[] args) {
        //目标：掌握stringBuilder的好处
        //需求：要拼接100万次abc
        //先用string测试
        // String rs = "";
        // for (int i = 1; i <= 1000000; i++) {
        //     rs = rs + "abc";
        // }
        // System.out.println(rs);
        //使用stringBuilder演示
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            ab.append("abc");
        }
        System.out.println(ab);
    }
}
