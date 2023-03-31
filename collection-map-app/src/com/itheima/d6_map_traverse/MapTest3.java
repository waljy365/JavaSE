package com.itheima.d6_map_traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
     目标：掌握Map集合的第三种遍历方式：lambda表达式。
 */
public class MapTest3 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 169.8);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 169.5);
        map.put("牛魔王", 183.6);
        System.out.println(map);
        map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String s, Double aDouble) {
                System.out.println(s+"------"+aDouble);
            }
        });
        System.out.println("===============");
        map.forEach((a,b)->{
            System.out.println(a+"------"+b);
        });
        System.out.println("===============");
        map.forEach((a,b)-> System.out.println(a+"------"+b));
    }
}

