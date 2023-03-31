package com.itheima.d1_inner_class1;

/**
 * @author : 王希辰
 * @date : 2023/2/27 9:36
 */
public class Outer {
    private int age=99;
    public static String a;
    //成员内部类
    public class Inner {
        //内部类可以有成员方法，成员变量
        private String name;

        private int age=88;

        public Inner() {
        }

        public Inner(String name) {
            this.name = name;
        }
        /*public static void test2() {

        }*/
        //private static String school;//jdk16才支持
        public void test() {
            int age=66;
            System.out.println(age);//66
            System.out.println(this.age);//88
            System.out.println(Outer.this.age);//99

            //可以访问外部类的变量
            System.out.println(a);
            System.out.println(age);
        }

        /**
         * 获取
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "Inner{name = " + name + "}";
        }
    }
}
