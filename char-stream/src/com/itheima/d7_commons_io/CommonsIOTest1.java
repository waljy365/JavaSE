package com.itheima.d7_commons_io;

import java.io.IOException;

/*
  目标：使用CommonsIO框架进行IO相关的操作。
 */
public class CommonsIOTest1 {

    public static void main(String[] args) throws IOException {
        // FileUtils.copyFile(new File("a.txt"), new File("aa.txt"));
        // Files.copy(Path.of("a.txt"), Path.of("aaa.txt"));
        // 对"中国"进行编码
        String s1 = "中国" ;
        byte[] bytes = s1.getBytes();

        // 对上述得到的字节数组进行编码
        String s2 = new String(bytes , "UTF-8") ;
        System.out.println(s2);
    }


}
