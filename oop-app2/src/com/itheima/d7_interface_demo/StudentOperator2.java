package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/26 16:22
 */
public class StudentOperator2 implements StudentOperator {
    @Override
    public void printAllStudent(ArrayList<Student> list) {
        System.out.println("打印所有学生信息");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getGender() == '男') {
                count1++;
            } else {
                count2++;
            }
            System.out.println(student);
        }
        System.out.println("男生："+count1+"人");
        System.out.println("女生："+count2+"人");
        System.out.println("有"+list.size()+"名学生");
        System.out.println("================");
    }

    @Override
    public void printAvg(ArrayList<Student> list) {
        System.out.println("打印平均成绩");
        double sum = 0;
        double max=list.get(0).getScore();
        double min=list.get(0).getScore();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            sum += student.getScore();
            if (max < student.getScore()) {
                max = student.getScore();
            }
            if (min > student.getScore()) {
                min = student.getScore();
            }
        }
        System.out.println("最高分"+max);
        System.out.println("最低分"+min);
        System.out.println("平均成绩：" + (sum-max-min) / (list.size()-2));
        System.out.println("=====================");
    }
}
