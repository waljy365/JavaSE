package com.itheima.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
    目标：掌握Map集合的特点。

    Map集合体系的特点
        注意：Map系列集合的特点都是由键决定的，值只是一个附属品，值是不做要求的

    HashMap（由键决定特点）: 无序、不重复、无索引；  （用的最多）
    LinkedHashMap （由键决定特点）:由键决定的特点：有序、不重复、无索引。
    TreeMap （由键决定特点）:按照大小默认升序排序、不重复、无索引。
 */
public class MapTest1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("as", 12);
        hashMap.put("we", 12);
        hashMap.put("we", 12);
        hashMap.put("us", 12);
        hashMap.put("io", 12);
        hashMap.put("usb", 12);
        System.out.println(hashMap);
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        hashMap.put("阿骨打", 12);
        hashMap.put("昂发", 12);
        hashMap.put("爱国古典风格", 12);
        hashMap.put("爱国古典风格", 12);
        hashMap.put("事实", 12);
        hashMap.put("天后宫", 12);
        hashMap.put("法国队", 12);
        System.out.println(linkedHashMap);
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "格尔");
        treeMap.put(5, "很乖回复");
        treeMap.put(5, "发挥很好");
        treeMap.put(4, "好艰难");
        treeMap.put(3, "怀疑");
        treeMap.put(8, "共患难");
        treeMap.put(9, "塔吉克");
        System.out.println(treeMap);
    }
}
