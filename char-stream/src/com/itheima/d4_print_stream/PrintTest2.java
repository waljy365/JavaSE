package com.itheima.d4_print_stream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
  目标：了解下输出语句的重定向。
 */
public class PrintTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("老骥伏枥");
        System.out.println("志在千里");
        PrintStream ps = new PrintStream("c7.txt");
        System.setOut(ps);
        System.out.println("烈士暮年");
        System.out.println("壮心不已");
    }

}
