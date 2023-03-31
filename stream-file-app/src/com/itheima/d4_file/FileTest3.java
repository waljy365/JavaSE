package com.itheima.d4_file;

import java.io.File;
import java.io.IOException;

/*
  目标：掌握File创建和删除文件相关的方法。

    public boolean createNewFile()	创建一个新的空的文件
    public boolean mkdir()	只能创建一级文件夹
    public boolean mkdirs()	可以创建多级文件夹

    public boolean delete()	删除文件、空文件夹
 */
public class FileTest3 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        System.out.println(f.createNewFile());
        File dir = new File("/ccc/c");
        System.out.println(dir.mkdir());
        System.out.println(dir.mkdirs());
        System.out.println(f.delete());
    }
}
