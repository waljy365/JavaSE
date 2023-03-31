package com.itheima.d3_collection_traverse;
import java.util.ArrayList;
import java.util.Collection;
/**
     目标：Collection集合的遍历方式二：增强for

     1 增强for可以用来遍历集合或者数组。
     2 增强for遍历集合，本质就是迭代器遍历集合的简化写法。
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        for (String s : c) {
            System.out.println(s);
        }
        System.out.println("---------------");
        String[] strings = c.toArray(new String[0]);
        for (String o : strings) {
            System.out.println(o);
        }
    }
}
