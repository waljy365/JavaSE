package com.itheima.d4_synchronized_code;

public class Account {
    private String cardId; // 卡号
    private double money; // 余额。

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }
    //如果是静态方法，锁是字节码对象
    public static void test() {
        synchronized (Account.class) {

        }
    }

    // 小明 小红线程同时过来的
    public void drawMoney(double money) {
        // 先搞清楚是谁来取钱？
        String name = Thread.currentThread().getName();
        //锁是"hm"会影响其他账号取钱
        //建议锁是共享对象,this就是共享对象
        synchronized (this) {
            // 1、判断余额是否足够
            if (this.money >= money) {
                System.out.println(name + "来取钱" + money + "成功！");
                this.money -= money;
                System.out.println(name + "来取钱后，余额剩余：" + this.money);
            } else {
                System.out.println(name + "来取钱：余额不足~");
            }
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
