package com.itheima.homework.question3;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author : 王希辰
 * @date : 2023/3/16 21:23
 */
public class Test {
    static ArrayList<Integer> list = new ArrayList();
    static ArrayList<String> list2 = new ArrayList();
    public static void main(String[] ages) throws NoSuchFieldException, IllegalAccessException, IOException {
        Class testClass = Test.class;
        list2.add("12333");
        Test test = new Test();
        Field list1 = testClass.getDeclaredField("list");
        // System.out.println(list1.getType());
        list1.set(test,list2);
        list.forEach(System.out::println);

        // 创建集合对象
        Properties props = new Properties();

        InputStream is = Test05.class.getClassLoader().getResourceAsStream("prop.properties");
        // 从属性文件中加载数据
        props.load(is);
        props.getOrDefault()
    }
}
