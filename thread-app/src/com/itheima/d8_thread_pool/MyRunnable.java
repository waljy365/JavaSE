package com.itheima.d8_thread_pool;

/**
 * @author : 王希辰
 * @date : 2023/3/13 16:34
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+"输出666");
    }
}
