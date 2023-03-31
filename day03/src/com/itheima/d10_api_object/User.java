package com.itheima.d10_api_object;

/**
 * @author : 王希辰
 * @date : 2023/2/27 14:40
 */
public class User implements Cloneable {
    private int id;//编号
    private String username;//用户名
    private String password;//密码
    private double[] scores;//分数
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User u2 = (User) super.clone();
        u2.scores = u2.scores.clone();
        return u2;
    }

    public User() {
    }

    public User(int id, String username, String password, double[] scores, Student student) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
        this.student = student;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return scores
     */
    public double[] getScores() {
        return scores;
    }

    /**
     * 设置
     *
     * @param scores
     */
    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", scores = " + scores + "}";
    }
}
