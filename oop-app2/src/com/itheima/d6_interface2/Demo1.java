package com.itheima.d6_interface2;

import com.itheima.d1_polymorphism.People;
import com.itheima.d1_polymorphism.Teacher;

/**
 * @author : 王希辰
 * @date : 2023/2/26 15:18
 */
public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();
        Singer singer = new perple();
        singer.sing();


    }
}

class Student {
    void study() {

    }
}

class Student1 extends Student {
    @Override
    void study() {
        super.study();
    }
}

class perple implements Writer, Singer {

    @Override
    public void write() {

    }

    @Override
    public void sing() {

    }
}

interface Writer {
    void write();
}

interface Singer {
    void sing();
}