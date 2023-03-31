package com.itheima.d2_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    目标：理解集合的并发修改异常问题，并解决。
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list);//  [王麻子, 小李子, 李爱花, 张全蛋, 晓李, 李玉刚]

        // 需求：找出集合中全部带“李”的名字，并从集合中删除。

        // for (int i = 0; i < list.size(); i++) {
        //     String s = list.get(i);
        //     if (s.contains("李")) {
        //         list.remove(s);
        //         i--;
        //     }
        // }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //list.remove(iterator.next());//报错 ConcurrentModificationException并发修改异常
            // String s = iterator.next();
            // if (s.contains("李")) {
            iterator.remove();
            // }

        }
        System.out.println(list);//  [王麻子, 小李子, 李爱花, 张全蛋, 晓李, 李玉刚]
    }
}