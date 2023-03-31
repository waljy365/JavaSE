package com.itheima.d2_buffered_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
     目标：掌握字符缓冲输入流的用法。

     BufferedReader(字符缓冲输入流)
     作用：自带8K（8192）的字符缓冲池，可以提高字符输入流读取字符数据的性能。

     构造方法
        public BufferedReader(Reader r)	把低级的字符输入流包装成字符缓冲输入流管道，从而提高字符输入流读字符数据的性能
     特有方法
        public String readLine()	读取一行数据返回，如果没有数据可读了，会返回null
 */
public class BufferedReaderTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // String string;
        // while ((string = br.readLine()) != null) {
        //     System.out.println(string);
        // }
        char[] chars=new char[1024];
        int len;
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }
    }
}
