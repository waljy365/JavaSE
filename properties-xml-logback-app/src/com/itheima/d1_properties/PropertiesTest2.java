package com.itheima.d1_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    目标：掌握把键值对数据存入到属性文件中去
        public void store(OutputStream os, String comments)	把键值对数据，通过字节输出流写出到属性文件里去
        public void store(Writer w, String comments)	把键值对数据，通过字符输出流写出到属性文件里去
        public void load(InputStream is)	通过字节输入流，读取属性文件里的键值对数据
        public void load(Reader reader)	通过字符输入流，读取属性文件里的键值对数据
 */
public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        // method1();
        // method2();
    }

    private static void method1() throws IOException {
        //读取文件内容
        System.out.println(System.getProperty("user.dir"));
        Properties prop = new Properties();
        prop.load(new FileReader("b.properties"));
        System.out.println(prop);
    }

    private static void method2() throws IOException {
        //将数据对象存进文件
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "123");
        prop.setProperty("lisi", "456");
        prop.setProperty("wangwu", "789");
        prop.store(new FileWriter("b.properties"),"this is a save file");
    }
}
