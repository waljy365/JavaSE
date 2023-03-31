package com.itheima.d1_math;

import java.io.IOException;

/**
 * @author : 王希辰
 * @date : 2023/2/27 18:57
 */
public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1.public static Runtime getRuntime() 返回与当前java应用程序相关的运行时对象
        Runtime r = Runtime.getRuntime();

        //2.public void exit(int status) 终止当前运行的虚拟机，该参数作为状态代码；按照惯例，非零状态代码表示异常终止。
        // r.exit(0);

        //3.public int availableProcessors() 获取虚拟机能够使用的处理器数
        System.out.println(r.availableProcessors());

        //4.public long totalMemory() 返回Java虚拟机中的内存总量。
        System.out.println(r.totalMemory()/1024.0/1024.0+"MB");

        //5.public long freeMemory() 返回java虚拟机中的可用内存量
        System.out.println(r.freeMemory()/1024.0/1024.0+"MB");

        //6.public Process exec (String command) 启动某个程序，并返回代表该程序的对象
        Process p = r.exec("D:\\QQ\\Bin\\QQ.exe");
        Thread.sleep(5000);
        p.destroy();
    }
}
