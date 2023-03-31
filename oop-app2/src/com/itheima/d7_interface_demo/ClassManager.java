package com.itheima.d7_interface_demo;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/26 15:53
 */
public class ClassManager{
    ArrayList<Student> students = new ArrayList<>();

    public ClassManager() {
        students.add(new Student("张三", '男', 55.0));
        students.add(new Student("李四", '女', 85.0));
        students.add(new Student("王五", '男', 45.0));
        students.add(new Student("赵六", '女', 73.0));
        students.add(new Student("田七", '男', 23.0));
    }
    //打印信息
    public void printAllStudent(StudentOperator studentOperator) {
        studentOperator.printAllStudent(students);
    }
    //获取平均分
    public void printAvg(StudentOperator studentOperator) {
        studentOperator.printAvg(students);
    }
}
