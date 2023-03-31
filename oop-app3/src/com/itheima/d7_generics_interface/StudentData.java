package com.itheima.d7_generics_interface;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:39
 */
public class StudentData implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public ArrayList<Student> getByName(String name) {
        return null;
    }
}
