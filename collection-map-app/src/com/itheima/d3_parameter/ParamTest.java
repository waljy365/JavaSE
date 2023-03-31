package com.itheima.d3_parameter;

import java.util.Arrays;

/*
     目标：认识可变参数，掌握其作用。

        可变参数 : 就是一种特殊形参，定义在方法、构造器的形参列表里，格式是：数据类型...参数名称；
        特点：可以不传数据给它；可以传一个或者同时传多个数据给它；也可以传一个数组给它。
        好处：常常用来灵活的接收数据。

        注意事项 :
            1 可变参数在方法内部就是一个数组。
            2 一个形参列表中可变参数只能有一个
            3 可变参数必须放在形参列表的最后面
 */
public class ParamTest {
    public static void main(String[] args) {
        // test(1);
        // test(1, 2, 3);
        // test(2,4,4);
        System.out.println(sum(1, 3, 5));
        System.out.println(sum(2, 4, 6));
    }
    public static int sum(int... arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void test(int... arr) {
        System.out.println("可变参数");
        System.out.println(Arrays.toString(arr));
    }
    public static void test(int a) {
        System.out.println("固定参数");
    }
}
