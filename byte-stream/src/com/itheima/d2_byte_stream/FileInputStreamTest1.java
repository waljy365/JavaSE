package com.itheima.d2_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
    目标：掌握文件字节输入流，每次读取一个字节。
    FileInputStream类
    构造方法
        public FileInputStream(File file)	创建字节输入流管道与源文件接通
        public FileInputStream(String pathname)	创建字节输入流管道与源文件接通
    成员方法
        public int read()	每次读取一个字节返回，如果发现没有数据可读会返回-1.
        public int read(byte[] buffer)	每次用一个字节数组去读取数据，返回字节数组读取了多少个字节，如果发现没有数据可读会返回-1.
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        // 1.创建输入流对象
        InputStream fis = new FileInputStream("a.txt");
        //不存在会报错
        int byt;
        while ((byt = fis.read()) != -1) {
            System.out.println(Integer.toHexString(byt));
            // System.out.print((char)byt);
        }
        fis.close();

    }
}
