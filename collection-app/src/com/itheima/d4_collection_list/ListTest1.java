package com.itheima.d4_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
    目标：掌握List系列集合的特点，以及其提供的特有方法。

    List集合特有的方法
         void add(int index,E element)	在此集合中的指定位置插入指定的元素
         E remove(int index)	删除指定索引处的元素，返回被删除的元素
         E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
         E get(int index)	返回指定索引处的元素
 */
public class ListTest1 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象（有序、可重复、有索引）
        List<String> list = new ArrayList<>();
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");
        System.out.println(list);
        // void add(int index,E element)	在此集合中的指定位置插入指定的元素
        list.add(1, "白晶晶");

        // E remove(int index)	删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(2));
        // E set(int index,E element)	修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(3,"紫霞仙子"));
        // E get(int index)	返回指定索引处的元素
        System.out.println(list.get(2));
        System.out.println(list);

    }
}
