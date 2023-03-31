package com.itheima.d6_map_traverse;
import java.util.*;
/*
     目标：掌握Map集合的第二种遍历方式：键值对。
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        // 1.迭代器
        Iterator<Map.Entry<String, Double>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println("key="+iterator.next().getKey()+",value="+iterator.next().getValue());
        }
        System.out.println("-----------------------------");
        // 2.增强for
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key+"-----"+value);
        }
        System.out.println("-----------------------------");
        // 3.foreach
        entries.forEach(s->{
            System.out.println("key="+s.getKey()+",value="+s.getValue());
        });
    }
}
