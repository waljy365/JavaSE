package com.itheima.d2_byte_stream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
     目标：掌握文件字节输出流FileOutputStream的使用。
 */
public class FileOutputStreamTest4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        // fos.write(97);
        // fos.write(new byte[]{97,98,99});
        //public void write(byte b[], int off, int len)
        // String s = new String("]afasdadadse");
        for (int i = 0; i < 10; i++) {
            fos.write("helloworld".getBytes());
            fos.write(System.lineSeparator().getBytes());
        }
        // fos.write(s.getBytes());
        // win /r/n
        // mac /r
        //linux /n
        fos.close();
    }
}
