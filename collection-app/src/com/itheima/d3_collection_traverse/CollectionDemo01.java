package com.itheima.d3_collection_traverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
    目标：Collection集合的遍历方式一：使迭代器Iterator遍历

    1 迭代器是用来遍历集合的专用方式(数组没有迭代器)，在Java中迭代器的代表是Iterator。
    2 Collection集合获取迭代器的方法
        Iterator<E> iterator()	返回集合中的迭代器对象，该迭代器对象默认指向当前集合的第一个元素
    3 Iterator迭代器中的常用方法
        boolean hasNext()	询问当前位置是否有元素存在，存在返回true ,不存在返回false
        E next()	获取当前位置的元素，并同时将迭代器对象指向下一个元素处。
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");
        // 1.迭代器
        //iterator()返回迭代器
        Iterator<String> iterator = c.iterator();
        //hasNext()判断迭代器指向是否有内容
        while (iterator.hasNext()) {
            //next()获取内容，并向后移动指针
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");
        // 2.增强for
        for (String s : c) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        // 3.foreach
        // default void forEach(Consumer<? super T> action):  结合Lambda表达式遍历集合：
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-------------------");
        c.forEach(s -> System.out.println(s));
        System.out.println("-------------------");
        c.forEach(System.out::println);
    }
}











