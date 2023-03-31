package com.itheima.d1_properties;

import java.util.Properties;
import java.util.Set;

/*
    目标：掌握使用Properties类读取属性文件中的键值对信息。

        Properties是一个Map集合（键值对集合），但是我们一般不会当集合使用。
        核心作用：Properties是用来代表属性文件的，通过Properties可以读写属性文件里的内容。

        构造方法
            public Properties()	用于构建Properties集合对象（空容器）
        成员方法
            public String getProperty(String key) 	根据键获取值(其实就是get方法的效果)
            public Set<String> stringPropertyNames()	获取全部键的集合（其实就是ketSet方法的效果）
            public Object setProperty(String key, String value) 	保存键值对数据到Properties对象中去。
 */
public class PropertiesTest1 {
    public static void main(String[] args) {
        System.getProperty("user.dir");
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "123");
        prop.setProperty("lisi", "456");
        prop.setProperty("wangwu", "789");
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s+"---"+prop.getProperty(s));
        }
    }
}
