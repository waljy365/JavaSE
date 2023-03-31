package com.itheima.d5_resource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
     目标：掌握释放资源的方式。
 */
public class Test2 {
    public static void main(String[] args) {
        FileOutputStream iso=null;
        FileInputStream is=null;
        try {
            is = new FileInputStream("H:\\Desktop\\21050461041.jpg");
            iso = new FileOutputStream("210.jpg");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1) {
                iso.write(bytes,0,len);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //释放资源
            if (iso != null) {
                try {
                    iso.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
