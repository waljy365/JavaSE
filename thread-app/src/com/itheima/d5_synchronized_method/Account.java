package com.itheima.d5_synchronized_method;

public class Account {
    private String cardId; // 卡号
    private double money; // 余额。

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    // 小明 小红线程同时过来的
    //synchronized修饰方法有隐式锁对象
    //实例方法；同步方法默认用this
    //静态方法：同步方法默认用类名.class 作为锁对象
    public synchronized void drawMoney(double money) {
        // 先搞清楚是谁来取钱？
        String name = Thread.currentThread().getName();
        // 1、判断余额是否足够
        if(this.money >= money){
            System.out.println(name + "来取钱" + money + "成功！");
            this.money -= money;
            System.out.println(name + "来取钱后，余额剩余：" + this.money);
        }else {
            System.out.println(name + "来取钱：余额不足~");
        }
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
