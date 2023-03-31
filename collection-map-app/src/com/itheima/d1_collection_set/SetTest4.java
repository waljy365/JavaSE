package com.itheima.d1_collection_set;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/*
    目标：掌握TreeSet集合的使用。

    排序规则 :
        根据compareTo方法的返回值进行指定元素位置
        如果返回值为负数，表示当前存入的元素是较小值，存左边
        如果返回值为0，表示当前存入的元素相等 , 不存
        如果返回值为正数，表示当前存入的元素是较大值，存右边
    this表示当前要存储的元素 , o表示的是已经存在的元素
 */
public class SetTest4 {
    public static void main(String[] args) {
        // TreeSet<Student> studentTreeSet = new TreeSet<>();
        TreeSet<Student> studentTreeSet = new TreeSet<>((Student o1, Student o2) ->
        {
            int i = o2.getAge() - o1.getAge();
            Collator instance = Collator.getInstance(Locale.CHINA);
            return i==0?instance.compare(o1.getName(),o2.getName()):i;
        });
        //比较器和自然排序同时存在，比较器生效
        Student s1 = new Student("会长三",12);
        Student s2 = new Student("欧式的奶粉",18);
        Student s3 = new Student("玉带河",45);
        Student s4 = new Student("史蒂夫", 60);
        Student s5 = new Student("玉藻暗器", 60);
        Student s6 = new Student("奇思", 60);
        Student s7 = new Student("萨达斯", 60);
        studentTreeSet.add(s1);
        studentTreeSet.add(s2);
        studentTreeSet.add(s3);
        studentTreeSet.add(s4);
        studentTreeSet.add(s5);
        studentTreeSet.add(s6);
        studentTreeSet.add(s7);
        System.out.println(studentTreeSet);
    }
}
