package com.itheima.d1_charset;

import java.util.Arrays;

/*
    目标：掌握如何使用Java代码完成对字符的编码和解码。

    String提供了编码方法
        byte[] getBytes()	使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        byte[] getBytes(String charsetName)	使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
    String提供了解码方法
        String(byte[] bytes)	通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        String(byte[] bytes, String charsetName)	通过指定的字符集解码指定的字节数组来构造新的 String
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1.编码
        String data = "a我b";
        //默认是按照平台字符集（UTF-8）进行编码的
        //[97, -26, -120, -111, 98]
        // a   三个字节表示一个汉字 b
        byte[] bytes = data.getBytes();
        System.out.println(Arrays.toString(bytes));
        //按照指定字符集编码
        //[97, -50, -46, 98]
        //a 两个字节表示一个汉字 b
        byte[] gbks = data.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        //解码
        //按照平台默认编码（UTF-8）编码
        String s1 = new String(bytes);
        System.out.println(s1);
        //按照指定字符集解码
        String s2 = new String(gbks,"GBK");
        System.out.println(s2);
    }
}

