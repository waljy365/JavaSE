package com.itheima.d4_algorithm;

import java.util.Arrays;

/**
 * 目标：掌握冒泡排序的编写。
 */
public class Test1 {
    public static void main(String[] args) {

        int[] arr ={12,4,3,56,20,45,23};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j< arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
