package com.itheima.d13_stringbuilder;

/**
 * @author : 王希辰
 * @date : 2023/2/27 16:42
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str.append("[" + arr[i]);
            } else if (i == arr.length - 1) {
                str.append("," + arr[i] + "]");
            } else {
                str.append("," + arr[i]);
            }
        }
        System.out.println(str);
    }
}
