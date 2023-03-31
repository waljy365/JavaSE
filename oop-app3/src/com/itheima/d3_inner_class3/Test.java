package com.itheima.d3_inner_class3;

/**
 * @author : 王希辰
 * @date : 2023/2/27 10:14
 */
public class Test {
    public static void main(String[] args) {
/*
        Animal a = new Cat();
        a.cry();
*/
        //匿名内部类 会立即创建一个子类对象
        Animal a=new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}

abstract class Animal {
    public abstract void cry();
}

/*
class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
}*/
