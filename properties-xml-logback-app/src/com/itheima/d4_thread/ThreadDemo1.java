package com.itheima.d4_thread;

/*
    多线程的创建方式一：继承Thread类

    实现步骤
        1 定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法
        2 创建MyThread类的对象
        3 调用线程对象的start()方法启动线程（启动后还是执行run方法的）

    方式一优缺点：
        优点：编码简单
        缺点：线程类已经继承Thread，无法继承其他类，不利于功能的扩展。

 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("你好世界");
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld");
        }
    }
}
