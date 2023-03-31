package com.itheima.d5_resource;

import java.io.*;

/*
     目标：掌握释放资源的方式：try-with-resource
 */
public class Test3 {
    public static void main(String[] args) {
        try (FileInputStream is = new FileInputStream("H:\\Desktop\\21050461041.jpg");
             FileOutputStream iso = new FileOutputStream("210.jpg");
             MyConnection myConnection = new MyConnection()) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                iso.write(bytes, 0, len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
