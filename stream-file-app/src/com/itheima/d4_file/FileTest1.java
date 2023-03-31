package com.itheima.d4_file;

import java.io.File;
import java.io.IOException;

/*
     目标：掌握File创建对象，代表具体文件的方案。
        public File(String pathname)	根据文件路径创建文件对象
        public File(String parent, String child)	根据父路径和子路径名字创建文件对象
        public File(File  parent, String child)	根据父路径对应文件对象和子路径名字创建文件对象
 */
public class FileTest1 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个File对象，指代某个具体的文件。
        System.out.println(System.getProperty("user.dir"));
        File f = new File("a.txt");
        File f1 = new File("\\abc\\a.txt");
        File f2 = new File("/abc/a.txt");
        File f3 = new File("/abc","a.txt");
        System.out.println(f.createNewFile());
    }
}
