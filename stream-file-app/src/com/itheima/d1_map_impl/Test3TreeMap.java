package com.itheima.d1_map_impl;

import java.text.Collator;
import java.util.Locale;
import java.util.TreeMap;

/*
    目标：掌握TreeMap集合的使用。

    需求：创建一个TreeMap集合，键是学生对象(Student)，值是籍贯(String)。
           学生属性姓名和年龄，按照年龄进行排序并遍历。
 */
public class Test3TreeMap {
    public static void main(String[] args) {
        // TreeMap<Student, String> map = new TreeMap<>();
        TreeMap<Student, String> map = new TreeMap<>((o1, o2) -> {
            Collator instance = Collator.getInstance(Locale.CHINA);
            return instance.compare(o2.getName(), o1.getName());
        });
        map.put(new Student("01"," 南坡",12),"nao");
        map.put(new Student("01"," wvfb",12),"nao");
        map.put(new Student("01"," 南wefweef坡",12),"dbdfb");
        map.put(new Student("01"," 南dfvdbd坡",12),"dbfd");
        map.put(new Student("01"," dbdbddb",12),"nao");
        System.out.println(map);
    }
}
