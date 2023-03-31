package com.itheima.d3_thread_safe;

/**
 * @author : 王希辰
 * @date : 2023/3/13 11:02
 */
public class Account {
    private String NO;
    private double money;

    public Account() {
    }

    public Account(String NO, double money) {
        this.NO = NO;
        this.money = money;
    }

    public String getNO() {
        return NO;
    }

    public void setNO(String NO) {
        this.NO = NO;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void drawMoney(double money) {
        if (this.money >= money) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.money -= money;
            System.out.println(Thread.currentThread().getName()+"取钱：" + money);
            System.out.println("余额：" + this.money);
        } else {
            System.out.println(Thread.currentThread().getName()+"余额不够");
        }
    }
}
