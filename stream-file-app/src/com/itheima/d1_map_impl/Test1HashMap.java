package com.itheima.d1_map_impl;


import java.util.HashMap;

/*
    目标：掌握Map集合下的实现类：HashMap集合的底层原理。

    需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。存储三个键值对元素，并遍历

    结论 : HashMap集合要先保证键的唯一,那么键存储的元素必须重写hashCode和equals方法
 */
public class Test1HashMap {
    public static void main(String[] args) {
        // 创建HashMap集合
        HashMap<Student , String> hm = new HashMap<>();
        hm.put(new Student("it001" , "柳岩" , 99) , "湖北");
        hm.put(new Student("it002" , "迪丽热巴" , 97.8) , "新疆");
        hm.put(new Student("it002" , "迪丽热巴" , 97.8) , "中国");


        System.out.println(hm);
    }
}
