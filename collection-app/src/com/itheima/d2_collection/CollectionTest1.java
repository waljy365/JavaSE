package com.itheima.d2_collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 目标：认识Collection体系的特点。
 *
 * 需求 : 演示List集合和Set集合的特点
 */
public class CollectionTest1 {

    public static void main(String[] args) {
        //list 有序 可重复 有索引
        LinkedList<String> list = new LinkedList<>();
        list.add("qsad");
        list.add("dfdhg");
        list.add("sdfsdfsfd");
        list.add("fhhgng");
        list.add("liluuli");
        System.out.println(list);
        //set 无序 不重复 无索引
        HashSet<String> set = new HashSet<>();
        set.add("qsad");
        set.add("dfdhg");
        set.add("sdfsdfsfd");
        set.add("fhhgng");
        set.add("liluuli");
        set.add("liluuli");
        System.out.println(set);
    }
}
