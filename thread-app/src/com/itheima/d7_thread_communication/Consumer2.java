package com.itheima.d7_thread_communication;

/**
 * @author : 王希辰
 * @date : 2023/3/13 19:34
 */
public class Consumer2 implements Runnable {
    Desk desk;
    public Consumer2(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            desk.getBaozi();
        }
    }
}
