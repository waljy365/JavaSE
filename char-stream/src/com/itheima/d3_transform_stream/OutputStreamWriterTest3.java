package com.itheima.d3_transform_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
     目标：掌握字符输出转换流的使用。

     构造器
        public OutputStreamWriter(OutputStream os)	可以把原始的字节输出流，按照代码默认编码转换成字符输出流。
        public OutputStreamWriter(OutputStream os，String charset)	可以把原始的字节输出流，按照指定编码转换成字符输出流(重点)
 */
public class OutputStreamWriterTest3 {
    public static void main(String[] args) throws IOException {
        // FileWriter osw = new FileWriter("b.txt", Charset.forName("GBK"));
        FileOutputStream fos = new FileOutputStream("b.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
        osw.write("你好十九届");
        osw.flush();
        osw.close();
    }
}
