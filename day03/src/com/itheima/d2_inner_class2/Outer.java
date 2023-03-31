package com.itheima.d2_inner_class2;

/**
 * @author : 王希辰
 * @date : 2023/2/28 10:03
 */
public class Outer {
    public String name2;
    public static String name3="heima";
    //静态内部类
    public static class Inner {
        public String name;
        public void test() {
            System.out.println(name3);
        }
        public static void test1() {
            System.out.println(name3);
        }
    }
}
