package com.itheima.d3_util;

import java.util.Random;

/**
 * @author : 王希辰
 * @date : 2023/2/24 16:18
 */
public class MyUtil {
    private MyUtil() {

    }
    public static String createCode(int num) {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            char c = data.charAt(random.nextInt(data.length()));
            code += c;
        }
        return code;
    }
}
