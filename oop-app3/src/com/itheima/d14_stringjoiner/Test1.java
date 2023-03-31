package com.itheima.d14_stringjoiner;

import java.util.StringJoiner;

/**
 * @author : 王希辰
 * @date : 2023/2/27 17:12
 */
public class Test1 {
    public static void main(String[] args) {
        //目标：stringJoiner
        StringJoiner s = new StringJoiner(",", "[", "]");
        s.add("ajva");
        s.add("ajva");
        s.add("ajva");
        System.out.println(s);
        printArray(new int[]{11,22,33});
    }

    public static void printArray(int[] arr) {
        StringJoiner s = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]+"");
        }
        System.out.println(s);
    }
}
