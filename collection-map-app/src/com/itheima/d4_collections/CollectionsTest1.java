package com.itheima.d4_collections;

import java.util.*;

/*
     目标：掌握Collections集合工具类的使用。
        public static <T> boolean addAll(Collection<? super T> c, T... elements)	给集合批量添加元素
        public static void shuffle(List<?> list) 	打乱List集合中的元素顺序
        public static <T> void sort(List<T> list)	对List集合中的元素进行升序排序
        public static <T> void sort(List<T> list，Comparator<? super T> c)	对List集合中元素，按照比较器对象指定的规则进行排序
 */
public class CollectionsTest1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("门萨沙发");
        list.add("斯蒂芬");

        // public static <T> boolean addAll(Collection<? super T> c, T... elements)	给集合批量添加元素
        Collections.addAll(list, " 撒破风帆股份", "鬼吞");
        System.out.println(list);

        // public static void shuffle(List<?> list) 	打乱List集合中的元素顺序
        Collections.shuffle(list);
        System.out.println(list);

        // public static <T> void sort(List<T> list)	对List集合中的元素进行升序排序
        //升序排序 自定义可以按年龄实现接口（自然排序）或者排序器
        List<String> list1 = new ArrayList<>();
        list1.add("652");
        list1.add("165");
        list1.add("162");
        list1.add("659");
        list1.add("461");
        list1.add("100");
        list1.add("152");
        list1.add("203");
        Collections.sort(list1);
        System.out.println(list1);

        // public static <T> void sort(List<T> list，Comparator<? super T> c)	对List集合中元素，按照比较器对象指定的规则进行排序

    }
}
