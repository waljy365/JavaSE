package com.itheima.d4_collections;

/**
 * @author : 王希辰
 * @date : 2023/3/5 18:21
 */
public class Card implements Comparable<Card>{
    private String num;
    private String color;
    private int size;

    public Card() {
    }

    public Card(String num, String color, int size) {
        this.num = num;
        this.color = color;
        this.size = size;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return num + color ;
    }

    @Override
    public int compareTo(Card o) {
        int i = o.size - this.size;
        return i==0?o.color.compareTo(this.color):i;
    }
}
