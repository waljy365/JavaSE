package com.itheima.d6_map_traverse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
      目标：掌握Map集合的遍历方式1：键找值
 */
public class MapTest1 {
    public static void main(String[] args) {
        // 准备一个Map集合。
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);
        // 1.迭代器
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            Double value = map.get(s);
            System.out.println("key="+s+",value="+value);
        }
        System.out.println("-----------------------------");
        // 2.增强for
        for (String key : keys) {
            Double value = map.get(key);
            System.out.println("key="+key+",value="+value);
        }
        System.out.println("-----------------------------");
        //foreach
        keys.forEach(s->{
            System.out.println("key="+s+",value="+map.get(s));
        });
    }
}
