package com.itheima.d1_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
        // 目标：掌握如何对数组中的对象进行排序。
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 162.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);
        // 1、public static void sort(类型[] arr)：对数组进行排序。
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // 2、public static <T> void sort(T[] arr, Comparator<? super T> c)

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge() == 0 ? (o2.getHeight() - o1.getHeight()>0?1:-1) : (o1.getAge() - o2.getAge());
            }
        });
    }
}
