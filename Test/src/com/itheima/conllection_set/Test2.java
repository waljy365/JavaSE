package com.itheima.conllection_set;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author : 王希辰
 * @date : 2023/3/7 13:33
 */
public class Test2 {
    public static void main(String[] args) {
        String[] name = {"赵敏", "小昭", "素素", "灭绝" };
        // 1.普通for
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("-------------------");

        // 2.增强for
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("-------------------");

        // 3.迭代器
        // 将数组转成流获取迭代器,遍历
        Iterator<String> iterator = Arrays.stream(name).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}