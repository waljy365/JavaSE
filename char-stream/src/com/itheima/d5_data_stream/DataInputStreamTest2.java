package com.itheima.d5_data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    目标：使用数据输入流读取特定类型的数据。

    DataInputStream : 用于读取数据输出流写出去的数据。
    构造器
        public DataInputStream(InputStream is)	创建新数据输入流包装基础的字节输入流

    方法	说明
        public final byte readByte() throws IOException	读取字节数据返回
        public final int readInt() throws IOException	读取int类型的数据返回
        public final double readDouble() throws IOException	读取double类型的数据返回
        public final String readUTF() throws IOException	读取字符串数（UTF-8）据返回
        public int readInt()/read(byte[])	支持读字节数据进来
 */
public class DataInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("c2.txt"));
        int i = dis.readInt();
        System.out.println(i);
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
