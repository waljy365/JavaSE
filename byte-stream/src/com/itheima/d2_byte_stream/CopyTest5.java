package com.itheima.d2_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
     目标：使用字节流完成对文件的复制操作。
     数据源
     目的地
 */
public class CopyTest5 {
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("H:\\Desktop\\21050461041.jpg");
        FileOutputStream iso = new FileOutputStream("210.jpg");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1) {
            iso.write(bytes,0,len);
        }

        // byte[] bytes = is.readAllBytes();
        // iso.write(bytes);
        iso.close();
        is.close();

    }
}
