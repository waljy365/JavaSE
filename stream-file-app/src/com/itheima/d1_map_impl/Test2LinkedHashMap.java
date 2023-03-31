package com.itheima.d1_map_impl;

import java.util.LinkedHashMap;

/*
    目标：掌握LinkedHashMap的底层原理。
 */
public class Test2LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Object, Object> hashMap = new LinkedHashMap<>();
        hashMap.put(2,"zhang");
        hashMap.put(1,"li");
        hashMap.put(3,"wang");
        System.out.println(hashMap);

    }
}
