package com.itheima.d2_inner_class2;

/**
 * @author : 王希辰
 * @date : 2023/2/27 9:54
 */
public class Outer {
    private String name;
    public static int age;
    //静态内部类
    public static class Inner {
        //东西都有
        public void test() {
            //可以访问静态成员，不能访问实例成员。
            // System.out.println(name);
            System.out.println(age);
        }
    }
}
