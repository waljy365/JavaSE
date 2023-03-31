package com.itheima.msg.service;

import com.itheima.msg.domain.CheckCode;

import java.util.ArrayList;

public class AliyunSendMsg extends A{

    // 存储短信验证码的集合
    public ArrayList<CheckCode> arrayList = new ArrayList<>();

    // 定义发送短信验证码时可选的数字字符
    public char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    // 发送短信验证码的方法
    public void sendMsg(String phone) {
        System.out.println("阿里云短信平台给" + phone + "发送验证码：" + createCode(chs));
        // 补全代码

    }

}
