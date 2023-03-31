package com.itheima.d14_stringjoiner;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author : 王希辰
 * @date : 2023/3/1 10:45
 */
public class Test2 {
    public static void main(String[] args) {
        Integer[] ints = {11, 22, 33};
        printArray(ints);
        Double[] doubles = {3.14, 53.4, 44.3};
        printArray(doubles);
        User[] users = new User[3];
        User user = new User("123", 12);
        User user1 = new User("123", 12);
        users[0] = user;
        users[1] = user1;
        System.out.println(Arrays.toString(users));
        System.out.println("--------------");
        printArray(users);
    }

    public static <T> void printArray(T[] ints) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < ints.length; i++) {
            stringJoiner.add(String.valueOf(ints[i]));
        }
        System.out.println(stringJoiner);
    }
}
