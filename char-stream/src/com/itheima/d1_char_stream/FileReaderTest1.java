package com.itheima.d1_char_stream;

import java.io.FileReader;
import java.io.IOException;

/*
     目标：掌握文件字符输入流。

     FileReader构造器
        public FileReader(File file)	创建字符输入流管道与源文件接通
        public FileReader(String pathname)	创建字符输入流管道与源文件接通
     成员方法
        public int read()	每次读取一个字符返回，如果发现没有数据可读会返回-1.
        public int read(char[] buffer)	每次用一个字符数组去读取数据，返回字符数组读取了多少个字符，如果发现没有数据可读会返回-1.
 */
public class FileReaderTest1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
        fr.close();

    }
}
