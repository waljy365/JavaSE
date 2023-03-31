package com.itheima.d13_stringbuilder;

/**
 * @author : 王希辰
 * @date : 2023/3/1 10:37
 */
public class Test3 {
    public static void main(String[] args) {
        int[] ints = {11,22,33};
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < ints.length; i++) {
            if (i != ints.length - 1) {
                builder.append(ints[i] + ",");
            } else {
                builder.append(ints[i]);
            }
        }
        builder.append("]");
        System.out.println(builder);
    }
}
