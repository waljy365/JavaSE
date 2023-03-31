package com.itheima.d3_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * 目标：Collection集合的遍历方式三：JDK8开始新增的Lambda表达式。
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("殷素素");
        c.add("周芷若");

        // default void forEach(Consumer<? super T> action):  结合Lambda表达式遍历集合：


        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        c.forEach(s -> System.out.println(s));

        c.forEach(System.out::println);
    }
}










