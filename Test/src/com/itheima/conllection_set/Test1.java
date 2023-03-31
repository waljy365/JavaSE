package com.itheima.conllection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : 王希辰
 * @date : 2023/3/4 19:30
 */
public class Test1 {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<>();//无序 不重复 无索引
        //Set<Integer> set = new LinkedHashSet<>();//有序 不重复 无索引
        Set<Integer> set = new TreeSet<>();//可排序（升序） 不重复 无索引
        set.add(555);
        set.add(777);
        set.add(555);
        set.add(666);
        set.add(888);
        set.add(666);
        set.add(777);
        set.add(888);
        System.out.println(set);
    }
}
