package com.itheima.d1_collection_set;

import java.util.HashSet;

/*
     目标：自定义的类型的对象，比如两个内容一样的学生对象，如果让HashSet集合能够去重复！
 */
public class SetTest3 {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("111", 12));
        studentSet.add(new Student("122", 45));
        studentSet.add(new Student("333", 50));
        studentSet.add(new Student("111", 12));
        System.out.println(studentSet);
    }
}
