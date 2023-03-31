package com.itheima.d3_stream;
import java.util.*;
import java.util.stream.Collectors;

/*
     目标：Stream流的终结方法

        void forEach(Consumer action)	对此流运算后的元素执行遍历
        long count()	统计此流运算后的元素个数
        Optional<T> max(Comparator<? super T> comparator)	获取此流运算后的最大值元素
        Optional<T> min(Comparator<? super T> comparator)	获取此流运算后的最小值元素
 */
public class StreamTest4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求1：请计算出身高超过168的学生有几人。
        System.out.println(students.stream().filter(s -> s.getHeight() > 168).count());
        System.out.println("-------------------");

        // 需求2：请找出身高最高的学生对象，并输出。
        System.out.println(students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get());
        System.out.println("-------------------");

        // 需求3：请找出身高最矮的学生对象，并输出。
        System.out.println(students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get());
        System.out.println("-------------------");
        // 需求4：请找出身高超过170的学生对象，并放到一个新集合中去返回。
        // 流只能收集一次。
        List<Student> list = students.stream().filter(s -> s.getHeight() > 170).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("-------------------");

        Object[] array = students.stream().filter(s -> s.getHeight() > 170).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("-------------------");
        // List<Student> list1 = students.stream().filter(s -> s.getHeight() > 170).toList();
        // System.out.println(list1);
        // 需求5：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回。
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).distinct().collect(Collectors.toMap(s->s.getName(),s->s.getHeight())));
    }
}
