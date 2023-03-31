package com.itheima.d4_print_stream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
    目标：掌握打印流：PrintStream/PrintWriter的用法。
 */
public class PrintTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter ps = new PrintWriter("c6.txt");
        ps.println(123);
        ps.println("bac");
        ps.println(true);
        ps.println(78.000000);
        ps.println("你好世界");
        ps.close();
    }
}
