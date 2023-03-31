package com.itheima.d5_regex;

import java.util.Scanner;

/**
 * 目标：校验用户输入的电话、邮箱、时间是否合法。
 */
public class RegexTest3 {
    public static void main(String[] args) {
        // checkPhone();
        checkEmail();
    }

    public static void checkPhone(){
        while (true) {
            System.out.println("请您输入您的电话号码(手机|座机): ");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            // 18676769999  010-3424242424 0104644535
            // 第一位是1
            // 第二位[] 3到9
            // 剩余9位是数字
            // 或者座机
            // 第一位是0
            // 之后2到7位是数字
            // -?(或者没有)
            // 后边一位[]是1到9
            // 之后4到19位是数字(\\d是指数字)
            if(phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的号码格式正确~~~");
                break;
            }else {
                System.out.println("您输入的号码格式不正确~~~");
            }
        }
    }

    public static void checkEmail(){
        while (true) {
            System.out.println("请您输入您的邮箱： ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            /**
             * dlei0009@163.com
             * 25143242@qq.com
             * itheima@itcast.com.cn
             */
            // \\w字母数字下划线 至少两位或者更多
            // @
            // \\w字母数字下划线 至少两位或者最多20位
            // \\. 点 \\w字母数字下划线 至少两位或者最多10位
            // ()中重复1到2位
            if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("您输入的邮箱格式正确~~~");
                break;
            }else {
                System.out.println("您输入的邮箱格式不正确~~~");
            }
        }
    }
}
