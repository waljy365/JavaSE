package com.itheima.d4_algorithm;

import java.util.Arrays;

/**
 *  目标：掌握选择排序。
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr ={12,4,3,56,20,45,23};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
