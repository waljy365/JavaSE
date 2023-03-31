package com.itheima.d1_exception;

import java.util.Scanner;

/**
 * 目标：掌握异常的处理方式：捕获异常，尝试修复。
 *
 * 需求：调用一个方法，让用户输入一个合适的价格返回为止。
 */
public class  ExceptionTest4 {
    public static void main(String[] args) {
        // 尝试修复
        while (true) {
            try {
                getPrice();
                break;
            } catch (Exception e) {
                //throw new RuntimeException(e);
                System.out.println("你输入的价格不正确，重新输入");
            }
        }
    }
    public static void getPrice() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入价格");
            double price = sc.nextDouble();
            if (price > 0 && price < 200) {
                System.out.println("价格合适");
                return;
            } else {
                System.out.println("价格不合适,请重新输入");
            }
        }
    }
}
