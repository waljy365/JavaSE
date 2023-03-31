package com.itheima.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        // 某学校Java学科分为基础班和就业班:
        // Java基础班:
        // 001	李晨
        // 002	范冰冰
        // Java就业班:
        // 001	马云
        // 002	马化腾
        //         使用HashMap嵌套HashMap方式完成存储数据,并遍历出所有的学生
        // 1.每个学生的学号和姓名就是一个键值对,可以放在一个map集合中
        // 2.Java基础班对应着存放学号和姓名的map集合
        // 3.先遍历出外面的Map集合,拿到内部的Map集合
        // 4.再遍历内部的Map和,将具体的key和value获取出来
        HashMap<String, HashMap<String, String>> people = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();
        map.put("001","李晨");
        map.put("002", "范冰冰");
        people.put("Java基础班", map);
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("001","马云");
        map1.put("002","马化腾");
        people.put("Java就业班", map);
        System.out.println("-----------------");
        people.forEach((a,b)->{
            System.out.println(a+":");
            b.forEach((s,t)->{
                System.out.println(s+"---"+t);
            });
        });
    }
}