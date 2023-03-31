package com.itheima.d1_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * 目标：掌握Arrays类的常用方法。
 */
public class ArraysTest1 {
    public static void main(String[] args) {

        //默认一个数组
        int[] arr = {11, 22, 44, 55, 33};
        // 1、public static String toString(类型[] arr): 返回数组的内容
        System.out.println(Arrays.toString(arr));

        // 2、public static 类型[] copyOfRange(类型[] arr, 起始索引, 结束索引) ：拷贝数组（指定范围，包前不包后）
        int[] res = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(res));


        // 3、public static copyOf(类型[] arr, int newLength)：拷贝数组，可以指定新数组的长度。
        int[] res2 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(res2));


        // 4、public static setAll(double[] array, IntToDoubleFunction generator)：把数组中的原数据改为新数据又存进去。
        double[] prices = {99.8, 128, 100};

        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.5;
            }
        });
        System.out.println(Arrays.toString(prices));
        // 5、public static void sort(类型[] arr)：对数组进行排序(默认是升序排序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}


