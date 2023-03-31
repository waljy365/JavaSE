package com.itheima.d4_thread;

/*
    多线程的创建方式二：实现Runnable接口

    实现步骤
        1 定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
        2 创建MyRunnable任务对象
        3 把MyRunnable任务对象交给Thread处理。
        4 调用线程对象的start()方法启动线程

    方式二的优缺点
        优点：任务类只是实现接口，可以继续继承其他类、实现其他接口，扩展性强。
        缺点：需要多一个Runnable对象。
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread = new Thread(myRunnable);
        // thread.start();
        // for (int i = 0; i < 100; i++) {
        //     System.out.println("你好世界");
        // }

        // Thread thread = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 10; i++) {
        //             System.out.println("HelloWorld");
        //         }
        //     }
        // });

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("HelloWorld");
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("你好世界");
        }
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld");
        }
    }
}
