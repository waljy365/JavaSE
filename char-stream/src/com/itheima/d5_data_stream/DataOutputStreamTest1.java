package com.itheima.d5_data_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    目标：数据输出流。
    DataOutputStream : 允许把数据和其类型一并写出去。

    构造器
        public DataOutputStream(OutputStream out)	创建新数据输出流包装基础的字节输出流
    方法
        public final void writeByte(int v) throws IOException	将byte类型的数据写入基础的字节输出流
        public final void writeInt(int v) throws IOException	将int类型的数据写入基础的字节输出流
        public final void writeDouble(Double v) throws IOException	将double类型的数据写入基础的字节输出流
        public final void writeUTF(String str) throws IOException	将字符串数据以UTF-8编码成字节写入基础的字节输出流
        public void write(int/byte[]/byte[]一部分)	支持写字节数据出去
 */
public class DataOutputStreamTest1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("c2.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(123);
        dos.writeDouble(554.2);
        dos.writeBoolean(false);
        dos.writeUTF("哈哈");
        dos.close();
    }
}
