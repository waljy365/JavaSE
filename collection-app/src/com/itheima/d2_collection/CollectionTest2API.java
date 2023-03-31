package com.itheima.d2_collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 * 目标：掌握Collection集合的常用API.
 * Collection是集合的祖宗类，它的功能是全部集合都可以继承使用的，所以要学习它。
 * Collection API如下:
 * - public boolean add(E e)：  把给定的对象添加到当前集合中 。
 * - public void clear() :清空集合中所有的元素。
 * - public boolean remove(E e): 把给定的对象在当前集合中删除。
 * - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
 * - public boolean isEmpty(): 判断当前集合是否为空。
 * - public int size(): 返回集合中元素的个数。
 * - public Object[] toArray(): 把集合中的元素，存储到数组中。
 * - boolean addAll(Collection<? extends E> c) 指定集合中的所有元素添加到此集合
 */
public class CollectionTest2API {
    public static void main(String[] args) {

        Collection c = new LinkedList<String>();

        System.out.println(c);
 // * - public boolean add(E e)：  把给定的对象添加到当前集合中 。
        c.add("qsad");
        c.add("dfdhg");
        c.add("sdfsdfsfd");
        c.add("fhhgng");
        c.add("liluuli");

 // * - public void clear() :清空集合中所有的元素。
 //        list.clear();

 // * - public boolean remove(E e): 把给定的对象在当前集合中删除。
        c.remove("liluuli");

 // * - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
        c.contains("fhhgng");

 // * - public boolean isEmpty(): 判断当前集合是否为空。
        System.out.println(c.isEmpty());

// * - public int size(): 返回集合中元素的个数。
        System.out.println(c.size());

 // * - public Object[] toArray(): 把集合中的元素，存储到数组中。
        Object[] objects = c.toArray();
        System.out.println(Arrays.toString(objects));

        // * - boolean addAll(Collection<? extends E> c) 指定集合中的所有元素添加到此集合
        Collection c1 = new LinkedList<>();
        c1.add("abc");
        c1.add("def");
        c1.add("ghl");
        c1.add("ijk");
        c1.add("mno");
        System.out.println(c1);
        c.addAll(c1);
        System.out.println(c);
    }


}
