package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/26 16:19
 */
public class StudentOperator1 implements StudentOperator {

    @Override
    public void printAllStudent(ArrayList<Student> list) {
        System.out.println("打印所有学生信息");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student);
        }
        System.out.println("================");
    }

    @Override
    public void printAvg(ArrayList<Student> list) {
        System.out.println("打印平均成绩");
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            sum+=student.getScore();
        }
        System.out.println("平均成绩："+sum/list.size());
        System.out.println("=====================");
    }
}
