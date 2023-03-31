package com.itheima.d3_stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
     目标：掌握Stream流提供的常见中间方法。
        Stream<T> filter(Predicate<? super T> predicate)	用于对流中的数据进行过滤。
        Stream<T> sorted()	对元素进行升序排序
        Stream<T> sorted(Comparator<? super T> comparator)	按照指定规则排序
        Stream<T> limit(long maxSize)	获取前几个元素
        Stream<T> skip(long n)	跳过前几个元素
        Stream<T> distinct()	去除流中重复的元素。
        <R> Stream<R> map(Function<T , R> mapper)	对元素进行加工，并返回对应的新流
        static <T> Stream<T> concat(Stream a, Stream b)	合并a和b两个流为一个流
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
        // 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        scores.stream().filter(s->s>60).sorted().forEach(System.out::println);
        System.out.println("===============");

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);

        // 需求2：找出年龄大于等于23,且年龄小于等于30岁的学生，并按照年龄降序输出.
        students.stream().filter(s->s.getAge()>23&&s.getAge()<30).sorted((a,b)->b.getAge()-a.getAge()).forEach(System.out::println);
        System.out.println("===============");

        // 需求3：取出身高最高的前3名学生，并输出。
        students.stream().sorted((a,b)->Double.compare(a.getHeight(), b.getHeight())).skip(students.size()-3).forEach(System.out::println);
        System.out.println("===============");

        // 需求4：取出身高倒数的2名学生，并输出。   s1 s2 s3 s4 s5 s6
        students.stream().sorted((a,b)->Double.compare(a.getHeight(), b.getHeight())).limit(2).forEach(System.out::println);
        System.out.println("===============");

        // 需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出。
        List<String> collect = students.stream().filter(student -> student.getHeight() > 168).map(Student::getName).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("===============");
    }
}
