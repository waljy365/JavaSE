package com.itheima.d7_thread_communication;

/**
 * 目标：了解一下线程通信。
 */
public class ThreadTest {
    public static void main(String[] args) {
        //   需求：3个生产者线程，负责生产包子，每个线程每次只能生产1个包子放在桌子上
        //      2个消费者线程负责吃包子，每人每次只能从桌子上拿1个包子吃。
        Desk desk = new Desk();
        new Thread(new Consumer1(desk),"c1").start();
        new Thread(new Consumer1(desk),"c2").start();
        new Thread(new Producer1(desk),"p1").start();
        new Thread(new Producer2(desk),"p2").start();
        new Thread(new Producer3(desk),"p3").start();

    }
}
