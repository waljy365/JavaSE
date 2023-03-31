package com.itheima.d12_api_integer;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/3/1 9:19
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(3.14);//自动装箱
        list.add(8.63);
        list.add(9.75);
        double d1 = list.get(0);//自动拆箱
        String preffix = "520";
        String suffix = "0.1314";
        int i = Integer.parseInt(preffix);
        double v = Double.parseDouble(suffix);
        System.out.println(i + v);
    }
}
