package com.itheima.homework.question2;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author : 王希辰
 * @date : 2023/3/16 21:18
 */
public class Test1 {
    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class studentClass = Student.class;
        Constructor declaredConstructor = studentClass.getDeclaredConstructor();
        Student stu = (Student) declaredConstructor.newInstance();
        System.out.println(stu);
    }
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class studentClass = Student.class;
        Constructor declaredConstructor = studentClass.getDeclaredConstructor(String.class);
        Student stu = (Student) declaredConstructor.newInstance("123");
        System.out.println(stu);
    }
}
