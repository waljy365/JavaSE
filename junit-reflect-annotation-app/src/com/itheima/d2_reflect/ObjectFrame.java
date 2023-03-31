package com.itheima.d2_reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/*
    对象框架
    目标：保存任意对象的字段和其数据到文件中去
 */
public class ObjectFrame {
    public static void saveObject(Object object) throws Exception{
        PrintStream printStream = new PrintStream(new FileOutputStream("123.txt",true),true);
        Class aClass = object.getClass();
        String simpleName = aClass.getSimpleName();
        printStream.println("-------------" + simpleName + "----------");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();
            declaredField.setAccessible(true);
            String s = String.valueOf(declaredField.get(object));
            // String s = (String) declaredField.get(object);
            printStream.println(name+"="+s);
        }
        printStream.close();
    }
}
