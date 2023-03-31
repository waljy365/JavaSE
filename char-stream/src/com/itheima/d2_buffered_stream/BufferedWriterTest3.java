package com.itheima.d2_buffered_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
     目标：掌握字符缓冲输出流的用法。

        BufferedWriter(字符缓冲输出流)
        作用：自带8K的字符缓冲池，可以提高字符输出流写字符数据的性能。

        构造方法
            public BufferedWriter(Writer r)	把低级的字符输出流包装成一个高级的缓冲字符输出流管道，从而提高字符输出流写数据的性能
        特有方法
            public void newLine()	换行

        远桥之下泛莲舟
        岱岩石上松溪流
        万仞翠山梨亭在
        莫闻空谷声悠悠
 */
public class BufferedWriterTest3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        bw.write("远桥之下泛莲舟");
        bw.newLine();
        bw.write("岱岩石上松溪流");
        bw.newLine();
        bw.write("万仞翠山梨亭在");
        bw.newLine();
        bw.write("莫闻空谷声悠悠");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
