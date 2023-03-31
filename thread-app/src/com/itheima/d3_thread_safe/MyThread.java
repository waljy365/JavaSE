package com.itheima.d3_thread_safe;

/**
 * @author : 王希辰
 * @date : 2023/3/13 11:05
 */
public class MyThread extends Thread{
    private Account account;
    public MyThread(String name,Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(10000);
    }
}