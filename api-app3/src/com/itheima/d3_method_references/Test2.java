package com.itheima.d3_method_references;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标：掌握特定类型的方法引用。
 */
public class Test2 {
    public static void main(String[] args) {
        String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        // 进行排序（默认是按照字符串的首字符编号进行升序排序的）
        // Arrays.sort(names);
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        // 要求 : 忽略首字符大小写进行排序。

        // 优化1 : lambda表达式
        // Arrays.sort(names, (String o1, String o2)-> {
        //        return o1.compareToIgnoreCase(o2);
        // });
        Arrays.sort(names, ( o1,  o2)->  o1.compareToIgnoreCase(o2) );


        // 优化2 : 特定类型的方法引用
        Arrays.sort(names, String::compareToIgnoreCase );
        System.out.println(Arrays.toString(names));
    }
}
