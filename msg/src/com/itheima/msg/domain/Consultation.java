package com.itheima.msg.domain;

import com.itheima.msg.service.B;

/**
 * @author : 王希辰
 * @date : 2023/2/27 9:02
 */
public class Consultation extends B {
    private int count;

    public Consultation() {
    }

    public Consultation(int count) {
        this.count = count;
    }


    @Override
    public void printSkill() {
        System.out.println("回答问题的人数"+this.count);
    }

    /**
     * 获取
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "Consultation{count = " + count + "}";
    }
}
