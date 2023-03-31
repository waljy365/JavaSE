package com.itheima.d2_lambda;

/*
    1 Lambda表达式介绍
        Lambda表达式是JDK 8开始新增的一种语法形式； 作用：用于简化匿名内部类的代码写法。
    2 Lambda表达式格式
        (被重写方法的形参列表) -> {
              被重写方法的方法体代码。
        }
        注意 :  Lambda表达式只能简化函数式接口的匿名内部类!!!
    3 什么是函数式接口？
        有且仅有一个抽象方法的接口。
        注意：将来我们见到的大部分函数式接口，上面都可能会有一个@FunctionalInterface的注解，有该注解的接口就必定是函数式接口。

 */
public class LambdaTest1 {
    public static void main(String[] args) {
        //Lambda
        Inte1 i1 = () -> {
            System.out.println("111111");
        };
        i1.show();
        Inte2 i2 = (Inte1 ie) -> {
            System.out.println("2222222");
        };
        i2.show(i1);
    }
}

interface Inte1 {
    void show();
}
interface Inte2 {
    void show(Inte1 inte1);
}