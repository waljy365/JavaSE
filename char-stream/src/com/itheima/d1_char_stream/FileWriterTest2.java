package com.itheima.d1_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
     目标：掌握文件字符输出流：写字符数据出去

     FileWriter(文件字符输出流)
        public FileWriter(File file)	创建字节输出流管道与源文件对象接通
        public FileWriter(String filepath)	创建字节输出流管道与源文件路径接通
        public FileWriter(File file，boolean append)	创建字节输出流管道与源文件对象接通，可追加数据
        public FileWriter(String filepath，boolean append)	创建字节输出流管道与源文件路径接通，可追加数据
     成员方法
        void write(int c)	写一个字符
        void write(String str)	写一个字符串
        void write(String str, int off, int len)	写一个字符串的一部分
        void write(char[] cbuf)	写入一个字符数组
        void write(char[] cbuf, int off, int len)	写入字符数组的一部分

     注意 : 字符流需要刷新
 */
public class FileWriterTest2 {
    public static void main(String[] args) throws IOException {
        // public FileWriter(String filepath)	创建字节输出流管道与源文件路径接通
        Writer writer = new FileWriter("a.txt");
        // writer.write(97);

        writer.write(new String("woncoa vsin"));
        // char[] chars = {'1','3'};
        // writer.write(chars);
        writer.close();
    }
}
