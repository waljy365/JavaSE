package com.itheima.d1_inner_class1;

/**
 * @author : 王希辰
 * @date : 2023/2/28 9:47
 */
public class Outer {
    public int age = 88;
    //成员内部类
    public class Inner {
        public int age = 77;
        public void test() {
            int age=66;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age);
        }
    }
}
