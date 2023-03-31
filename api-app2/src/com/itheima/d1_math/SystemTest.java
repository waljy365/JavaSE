package com.itheima.d1_math;

/**
 * @author : 王希辰
 * @date : 2023/2/27 17:28
 */
public class SystemTest {
    public static void main(String[] args) {
        //目标：了解System的常见方法
        //public static void exit(int status):
        //终止当前运行的java虚拟机
        //该参数用作状态代码；按照惯例，非零状态代码表示异常终止。
        // System.exit(0);//人为终止虚拟机。（不要用）
        //public static long currentTimeMillis ();
        //获取当前系统时间
        //返回是long类型的时间毫秒值，指从1970-1-1 开始走到此刻的总毫秒值，1s=1000ms
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
