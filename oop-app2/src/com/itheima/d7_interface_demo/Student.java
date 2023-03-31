package com.itheima.d7_interface_demo;

/**
 * @author : 王希辰
 * @date : 2023/2/26 15:52
 */
public class Student {
    private String name;
    private char gender;
    private double score;

    public Student() {
    }

    public Student(String name, char gender, double score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

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

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return score
     */
    public double getScore() {
        return score;
    }

    /**
     * 设置
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student{name = " + name + ", gender = " + gender + ", score = " + score + "}";
    }
}
