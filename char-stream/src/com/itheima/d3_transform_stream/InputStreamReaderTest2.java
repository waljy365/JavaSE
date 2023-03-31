package com.itheima.d3_transform_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    目标：掌握字符输入转换流的作用。

    InputStreamReader（字符输入转换流）

    构造器
        public InputStreamReader(InputStream is)	把原始的字节输入流，按照代码默认编码转成字符输入流（与直接用FileReader的效果一样）
        public InputStreamReader(InputStream is ，String charset)	把原始的字节输入流，按照指定字符集编码转成字符输入流(重点)
 */
public class InputStreamReaderTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader isr = new InputStreamReader(fis,"GBK");
        // FileReader isr = new FileReader("a.txt", Charset.forName("GBK"));
        char[] arr = new char[1024];
        int len;
        while ((len = isr.read(arr)) != -1) {
            System.out.println(new String(arr,0,len));
        }
    }
}
