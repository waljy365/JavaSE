package com.itheima.d2_byte_stream;


import java.io.File;
import java.io.FileInputStream;

/*
     目标：使用文件字节输入流一次读取完文件的全部字节。
     FileInputStream类
        public byte[] readAllBytes() throws IOException	直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) throws Exception {
        // 1.创建输入流对象
        File file = new File("a.txt");
        FileInputStream fis = new FileInputStream(file);
        //不存在会报错
        // byte[] bytes = new byte[(int) file.length()];
        // int byt;
        // while ((byt = fis.read(bytes)) != -1) {
        //     System.out.println(new String(bytes,0,byt));
        // }
        // byte[] bytes = fis.readAllBytes();
        // System.out.println(new String(bytes));

        fis.close();
    }
}
