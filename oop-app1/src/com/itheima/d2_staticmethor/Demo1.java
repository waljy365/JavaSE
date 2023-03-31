package com.itheima.d2_staticmethor;

/**
 * @author : 王希辰
 * @date : 2023/2/24 15:42
 */
public class Demo1 {
    public static void main(String[] args) {
        //类名.类方法（推荐）
        Student.printHelloWorld();
        //对象.类方法(不推荐)
        Student student = new Student();
        student.printHelloWorld();
        //实例方法
        //对象.实例方法
        student.printScore();
        //类名.实例方法（报错）
        // Student.printScore();

    }
}
