package com.itheima.homework;

import java.util.LinkedHashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Student, String> lhm = new LinkedHashMap<>();

        lhm.put(new Student("it001", "张三", 88), "上海");
        lhm.put(new Student("it001", "李四", 89), "北京");
        lhm.put(new Student("it003", "王五", 98), "广州");
        lhm.put(new Student("it004", "赵六", 68), "深圳");


        Set<Student> keySet = lhm.keySet();
        for (Student key : keySet) {
            System.out.println(key + "---" + lhm.get(key));
        }
    }
}
