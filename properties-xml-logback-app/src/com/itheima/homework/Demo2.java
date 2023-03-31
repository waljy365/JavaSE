package com.itheima.homework;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author : 王希辰
 * @date : 2023/3/11 21:39
 */
public class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        Thread thread = new Thread(b);
        thread.start();
        C c = new C();
        FutureTask futureTask=new FutureTask(c);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        for (int i = 0; i < 100; i++) {

            System.out.println("123");
        }
    }

}

class A extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("1");
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("2");
        }
    }
}

class C implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {

            System.out.println("3");
        }
        return "3";
    }
}