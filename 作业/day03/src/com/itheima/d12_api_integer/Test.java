package com.itheima.d12_api_integer;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 15:17
 */
public class Test {
    public static void main(String[] args) {
        //包装类
        // Integer a1 = new Integer(12);
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);
        System.out.println("--------------");
        //自动装箱：可以自动把基本类型的数据转换成对象。
        Integer a3 = 12;
        System.out.println(a3);
        System.out.println("===============");
        //自动拆箱：可以自动把包装类型的对象转换成对应的基本数据类型。
        int a4 = a3;
        //泛型和集合不支持基本数据类型，只支持引用类型，可以使用包装类。
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);//自动装箱
        list.add(13);
        int integer = list.get(1);//自动拆箱
        //基本类型转字符串
        Integer in1 = 12;
        String str = in1.toString();
        System.out.println(str.getClass());
        //字符串转int
        Integer we = Integer.parseInt(str);
        System.out.println(we.getClass());
    }
}
