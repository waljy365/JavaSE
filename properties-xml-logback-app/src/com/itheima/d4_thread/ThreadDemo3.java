package com.itheima.d4_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/*
    多线程的第三种创建方式：利用Callable接口、FutureTask类来实现。

    实现步骤
        1 创建任务对象
            定义一个类实现Callable接口，重写call方法，封装要做的事情，和要返回的数据。
            把Callable类型的对象封装成FutureTask（线程任务对象）。
        2 把线程任务对象交给Thread对象。
        3 调用Thread对象的start方法启动线程。
        4 线程执行完毕后、通过FutureTask对象的的get方法去获取线程任务执行的结果。


    方式三优缺点：
        优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强；可以在线程执行完毕后去获取线程执行的结果。
        缺点：编码复杂一点。

 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask(myCallable);
        Thread t = new Thread(futureTask);
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("你好世界");
        }
    }
}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld");
        }
        return "执行完了";
    }
}
