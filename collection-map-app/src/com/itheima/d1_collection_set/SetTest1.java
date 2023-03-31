package com.itheima.d1_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
    目标：整体了解一下Set系列集合的特点

    Set集合的体系特点
        HashSet : 无序、不重复、无索引。
        LinkedHashSet：有序、不重复、无索引。
        TreeSet：排序、不重复、无索引。

    需求 : 演示Set集合的每一个实现类的特点
 */
public class SetTest1 {
    public static void main(String[] args) {
        // HashSet<String> set = new HashSet<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("鼠");
        set.add("牛");
        set.add("虎");
        set.add("兔");
        set.add("鼠");
        System.out.println(set);
        // 1.迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------");
        // 2.增强for
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-------------");
        // 3.foreach
        set.forEach((a)->{
            System.out.println(a);
        });
        System.out.println("-------------");

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("123");
        set1.add("456");
        set1.add("789");
        set1.add("100");
        set1.add("300");
        set1.add("300");
        System.out.println(set1);
    }
}
