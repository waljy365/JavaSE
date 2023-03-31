package com.itheima.d2_thread_api;

/**
 * 目标：掌握Thread的常用方法。
 *Thread提供的构造方法
 *     public Thread(String name)	可以为当前线程指定名称
 *     public Thread(Runnable target)	封装Runnable对象成为线程对象
 *     public Thread(Runnable target, String name)	封装Runnable对象成为线程对象，并指定线程名称
 * Thread提供的常用方法
 *     public void run()	线程的任务方法
 *     public void start()	启动线程
 *     public String getName()	获取当前线程的名称，线程名称默认是Thread-索引
 *     public void setName(String name)	为线程设置名称
 *     public static Thread currentThread()	获取当前执行的线程对象
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号");
        // t1.setName("1号");
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号");
        // t2.setName("2号");
        t2.start();
        System.out.println(t2.getName());

        Thread.currentThread().setName("主");
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程输出：" + i);
        }
    }
}
