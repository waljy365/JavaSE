package com.itheima.d3_method_references;

/**
 * 目标：构造器引用(理解语法)
 */
public class Test3 {
    public static void main(String[] args) {

        CreateCar car=new CreateCar() {
            @Override
            public Car create(String name, double price) {
                return null;
            }
        };
        // 1 使用lambda表达式
        CreateCar car1=new CreateCar() {
            @Override
            public Car create(String name, double price) {
                return null;
            }
        };
        // 2 使用构造器引用

    }
}

interface CreateCar {
    // 抽象方法 : 接受两个参数 , 创建Car对象并返回
    Car create(String name, double price);
}