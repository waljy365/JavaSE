package com.itheima.d7_thread_communication;

/**
 * @author : 王希辰
 * @date : 2023/3/13 19:38
 */
public class Producer3 implements Runnable{
    Desk desk = new Desk();

    public Producer3(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            desk.addBaozi();
        }
    }
}
