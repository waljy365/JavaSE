package com.itheima.d4_proxy;

/**
 * @author : 王希辰
 * @date : 2023/3/16 18:23
 */
public class BigStar implements Star {
    public BigStar(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public String sing(String name) {
        System.out.println(this.name+"演唱"+name);
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name+"正在跳舞");
    }
}
