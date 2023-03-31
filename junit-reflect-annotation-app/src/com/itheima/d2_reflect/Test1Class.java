package com.itheima.d2_reflect;

import org.junit.Test;

/*
     目标：获取Class对象。

     获取Class对象的三种方式
        1, Class c1 = 类名.class
        2, 调用Class提供方法：public static Class forName(String package)；
        3, Object提供的方法： public Class getClass()；  Class c3 = 对象.getClass();
 */
public class Test1Class {
    @Test
    public void test1() throws ClassNotFoundException {
        Class aClass = Student.class;
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        Class bClass = Class.forName("com.itheima.d2_reflect.Student");

        System.out.println(aClass==bClass);

        Student student = new Student();
        Class cClass = student.getClass();
        System.out.println(cClass==bClass);

    }
}
