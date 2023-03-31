package com.itheima.d7_interface_demo;

/**
 * @author : 王希辰
 * @date : 2023/2/26 15:54
 */
public class Demo1 {
    public static void main(String[] args) {
        ClassManager cm = new ClassManager();
        StudentOperator studentOperator=new StudentOperator2();
        cm.printAllStudent(studentOperator);
        cm.printAvg(studentOperator);
    }
}
