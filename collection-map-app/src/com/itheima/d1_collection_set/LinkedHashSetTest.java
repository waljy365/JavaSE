package com.itheima.d1_collection_set;

import java.util.LinkedHashSet;

/*
    LinkedHashSet：有序、不重复、无索引。
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("鼠");
        set.add("牛");
        set.add("虎");
        set.add("兔");
        set.add("鼠");
    }
}
