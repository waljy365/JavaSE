package com.itheima.d3_abatract;

/**
 * @author : 王希辰
 * @date : 2023/2/26 11:39
 */
public abstract class Animal {
    //必须要重写的时候，使用抽象方法
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void cry();

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{name = " + name + "}";
    }
}
