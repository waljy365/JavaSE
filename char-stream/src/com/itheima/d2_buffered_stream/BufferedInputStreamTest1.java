package com.itheima.d2_buffered_stream;

import java.io.*;

/*
    目标：掌握字节缓冲流的作用。

    原理：字节缓冲输入流自带了8KB缓冲池；字节缓冲输出流也自带了8KB缓冲池。

    构造器
    public BufferedInputStream(InputStream is)	把低级的字节输入流包装成一个高级的缓冲字节输入流，从而提高读数据的性能
    public BufferedOutputStream(OutputStream os)	把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能
 */
public class BufferedInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\QQ\\qq信息\\3428767101\\FileRecv\\0-2：前言：课程地位及课程内容.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("2.mp4"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        System.out.println("复制好了");
        bos.close();
        bis.close();
    }
}
