package com.itheima.msg.service;

import java.util.Random;

/**
 * @author : 王希辰
 * @date : 2023/2/26 21:06
 */
public abstract class A {
    public String createCode(char[] chs) {
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(chs.length);
            char c = chs[i1];
            code += c;
        }
        return code;
    }
    public abstract void sendMsg(String phone);

}
