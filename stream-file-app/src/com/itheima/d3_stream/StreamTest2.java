package com.itheima.d3_stream;

import java.util.*;
import java.util.stream.Stream;

/*
        目标：掌握Stream流的创建。

        1 单列集合获取Stream流
        2 双列集合获取Stream流
        3 数组获取Stream流
        4 同一种类型多个数据获取Stream流
 */
public class StreamTest2 {
    public static void main(String[] args) {
        // 1、如何获取List集合的Stream流？
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");
        names.stream().forEach(System.out::println);
        // 2 双列集合获取Stream流
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("fcwwe","sfsdf");
        hashMap.put("adv","btt");
        hashMap.put("rgh","uk");
        hashMap.keySet().stream().forEach(s -> {
            System.out.println(s+"----"+hashMap.get(s));
        });
        hashMap.entrySet().stream().forEach(s->{
            System.out.println(s.getKey()+"___"+s.getValue());
        });
        // 3 数组获取Stream流
        Arrays.stream(new int[]{1,3,5,6,9}).forEach(System.out::println);

        //of()方法
        Stream.of(1,2,3,45,56,46).forEach(System.out::println);
    }
}
