package com.itheima.d3_inner_class3;

/**
 * @author : 王希辰
 * @date : 2023/2/28 10:23
 */
public class Test {
    public static void main(String[] args) {
        //两步，建实现类，创对象
        A a = new A();
        a.swim();
        //直接建对象
        //可以是接口也可以是抽象类
        Swimming b = new Swimming() {
            @Override
            public void swim() {
                System.out.println("内部类");
            }
        };
        b.swim();
        //直接做参数传过去
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游泳");
            }
        });
    }
    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
    }
}

interface Swimming {
    void swim();
}

class A implements Swimming {

    @Override
    public void swim() {
        System.out.println("不用内部类");
    }
}