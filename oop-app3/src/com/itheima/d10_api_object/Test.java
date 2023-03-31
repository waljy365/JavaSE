package com.itheima.d10_api_object;

import java.util.Objects;

/**
 * @author : 王希辰
 * @date : 2023/2/27 13:07
 */
public class Test {
    public static void main(String[] args) {
        //目标：掌握tostring() clone() equals()
        Student s = new Student("招募民", 13);
        System.out.println(s);
        //默认比较地址值是否相同
        Student s1 = new Student("招募民", 13);
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s));
        System.out.println("=============");
        System.out.println(Objects.equals("111","111"));
    }
}
