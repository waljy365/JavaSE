package com.itheima.d8_extends_application;

/**
 * @author : 王希辰
 * @date : 2023/2/25 11:12
 */
public class Teather extends People {
    private String sklii;
    public void show() {
        System.out.println("技能是"+sklii);
    }

    public Teather() {
    }

    public Teather(String sklii) {
        this.sklii = sklii;
    }

    /**
     * 获取
     * @return sklii
     */
    public String getSklii() {
        return sklii;
    }

    /**
     * 设置
     * @param sklii
     */
    public void setSklii(String sklii) {
        this.sklii = sklii;
    }

    public String toString() {
        return "Teather{sklii = " + sklii + "}";
    }
}
