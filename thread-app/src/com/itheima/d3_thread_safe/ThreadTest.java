package com.itheima.d3_thread_safe;

/**
 * 目标：模拟线程安全问题。
 */
public class ThreadTest {
    public static void main(String[] args) {
        Account account = new Account("ICBC-001",10000);
        new MyThread("小红", account).start();
        new MyThread("小明", account).start();

    }
}
