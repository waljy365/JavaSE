package com.itheima.d11_api_objects;

import com.itheima.d10_api_object.Student;

import java.util.Objects;

/**
 * @author : 王希辰
 * @date : 2023/2/27 15:05
 */
public class Test {
    public static void main(String[] args) {
        //equals() isNull() noNull()
        Student s1 = null;
        Student s2 = new Student("12", 12);
        // System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));//更安全，当s1指向空报异常
        System.out.println("---------------");
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));
        System.out.println("--------------");
        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));
    }
}
