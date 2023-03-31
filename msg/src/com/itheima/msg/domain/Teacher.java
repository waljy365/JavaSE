package com.itheima.msg.domain;

import com.itheima.msg.service.B;

/**
 * @author : 王希辰
 * @date : 2023/2/27 9:00
 */
public class Teacher extends B {
    private String sklii;

    public Teacher() {
    }

    public Teacher(String name,int age,String sklii) {
        super(name,age);
        this.sklii = sklii;
    }


    @Override
    public void printSkill() {
        System.out.println("讲师技能为："+this.sklii);
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
        return "Teacher{sklii = " + sklii + "}";
    }
}
