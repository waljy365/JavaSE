package com.itheima.homework;

/**
 * @author : 王希辰
 * @date : 2023/2/25 18:22
 */
public class OldPhone {
    private String brand;
    private double price;

    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
    public void sendMessage() {
        System.out.println("发短信");
    }

    public void displayPhone() {
        System.out.println("显示手机好");
    }

    public OldPhone() {
    }

    public OldPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * 获取
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     *
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "OldPhone{brand = " + brand + ", price = " + price + "}";
    }
}
