package com.itheima.d2_buffered_stream;

import java.io.*;

/*
    目标：观察原始流和缓冲流的性能。
 */
public class TimeTest4 {
    public static void main(String[] args) throws IOException {
        OneByte();
    }
    public static void Buffer() throws IOException {
        long start = System.currentTimeMillis();
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
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");
    }
    public static void OneByteBuffer() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\QQ\\qq信息\\3428767101\\FileRecv\\0-2：前言：课程地位及课程内容.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("2.mp4"));
        int len ;
        while ((len=bis.read())!= -1) {
            bos.write(len);
        }
        System.out.println("复制好了");
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");
    }
    public static void Base() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream is = new FileInputStream("D:\\QQ\\qq信息\\3428767101\\FileRecv\\0-2：前言：课程地位及课程内容.mp4");
        FileOutputStream iso = new FileOutputStream("210.mp4");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            iso.write(bytes,0,len);
        }
        System.out.println("复制好了");
        iso.close();
        is.close();
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");
    }
    public static void OneByte() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream is = new FileInputStream("D:\\QQ\\qq信息\\3428767101\\FileRecv\\0-2：前言：课程地位及课程内容.mp4");
        FileOutputStream iso = new FileOutputStream("210.mp4");
        int len ;
        while ((len=is.read())!= -1) {
            iso.write(len);
        }
        System.out.println("复制好了");
        iso.close();
        is.close();
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"ms");
    }
}










