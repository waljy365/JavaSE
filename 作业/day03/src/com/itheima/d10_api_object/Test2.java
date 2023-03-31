package com.itheima.d10_api_object;

/**
 * @author : 王希辰
 * @date : 2023/2/27 14:39
 */
public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(1, "zhangsna", "wollll", new double[]{12.1, 15, 6, 23.4},new Student("qweq",12));
        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getPassword());
        System.out.println(u1.getScores());
        System.out.println(u1.getStudent());

        User u2 = (User) u1.clone();
        //浅克隆 数据克隆，引用克隆地址
        //深克隆 数据克隆，字符串考地址，其他对象创新新对象
        System.out.println(u2.getId());
        System.out.println(u2.getUsername());
        System.out.println(u2.getPassword());
        System.out.println(u2.getScores());
        System.out.println(u2.getStudent());
        System.out.println(u1.getStudent()==u2.getStudent());
    }
}
