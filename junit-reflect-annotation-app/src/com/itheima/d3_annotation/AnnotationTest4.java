package com.itheima.d3_annotation;

import java.lang.reflect.Method;

/*
    目标：模拟Junit框架的设计。
    需求
        定义若干个方法，只要加了MyTest注解，就会触发该方法执行。
    分析
        定义一个自定义注解MyTest，只能注解方法，存活范围是一直都在。
        定义若干个方法，部分方法加上@MyTest注解修饰，部分方法不加。
        模拟一个junit程序，可以触发加了@MyTest注解的方法执行。

 */
public class AnnotationTest4 {
    @MyAnno4
    public void test1() {
        System.out.println("===test1====");
    }

    public void test2() {
        System.out.println("===test2====");
    }

    @MyAnno4
    public void test3() {
        System.out.println("===test3====");
    }

    public void test4() {
        System.out.println("===test4====");
    }

    public static void main(String[] args) throws Exception {
        AnnotationTest4 a = new AnnotationTest4();
        // 启动程序！
        // 1、得到Class对象
        Class annotationTest4C = AnnotationTest4.class;
        // 2、提取这个类中的全部成员方法
        Method[] declaredMethods = annotationTest4C.getDeclaredMethods();
        // 3、遍历这个数组中的每个方法，看方法上是否存在@MyTest注解，存在
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(MyAnno4.class)) {
                // 触发该方法执行。
                declaredMethod.invoke(a);
            }
        }
    }
}
