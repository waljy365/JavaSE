package com.itheima.d7_thread_communication;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/3/13 19:35
 */
public class Desk {
    ArrayList<String> desk = new ArrayList<>();

    public synchronized void getBaozi() {
        Thread thread = Thread.currentThread();
        try {
            if (desk.size() == 1) {
                System.out.println(thread.getName() + "吃了包子");
                desk.clear();
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void addBaozi() {
        Thread thread = Thread.currentThread();
        try {
            if (desk.size() == 0) {
                System.out.println(thread.getName() + "做了包子");
                desk.add(thread.getName() + "做了包子");
                this.notifyAll();
                this.wait();
            } else {
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
