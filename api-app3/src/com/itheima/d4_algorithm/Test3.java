package com.itheima.d4_algorithm;

/**
 * 目标：掌握二分查找算法。
 *
 * binarySearch
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 15, 20, 45, 50, 52};
        System.out.println(search(arr, 100));
    }

    /**
     * 接受一个数组,和要查找的数，并返回索引
     * @param arr
     * @param num
     * @return
     */
    public static int search(int arr[], int num) {
        int left=0;//左坐标
        int right = arr.length - 1;//右坐标
        while (left <= right) {
            int mid = (left + right) / 2;//中间坐标
            //根据中间坐标数据 进行比较
            if (arr[mid] == num) {//找到数据
                return mid;
            } else if (arr[mid] > num) {//中间数据比目标数大,右坐标左移
                right = mid - 1;
            } else {//中间数据比目标数小,左坐标右移
                left = mid + 1;
            }
        }
        return -1;
    }
}
