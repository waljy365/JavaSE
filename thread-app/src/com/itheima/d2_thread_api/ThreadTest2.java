package com.itheima.d2_thread_api;

/**
 * 目标：掌握sleep方法，join方法的使用
 * Thread提供的常用方法
 * public static void sleep(long time)	让当前执行的线程休眠多少毫秒后，再继续执行
 * public final void join()...	让调用当前这个方法的线程先执行完！
 */
public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("1号");
        t1.start();
        // t1.join();
        // Thread.sleep(3000);
        Thread t2 = new MyThread("2号");
        t2.start();
        t2.join();
        Thread t3 = new MyThread("3号");
        t3.start();
        t3.join();
    }
}
