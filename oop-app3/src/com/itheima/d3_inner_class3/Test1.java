package com.itheima.d3_inner_class3;

/**
 * @author : 王希辰
 * @date : 2023/2/27 10:22
 */
public class Test1 {
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游得块");
            }
        };
        s1.swim();
        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("猫游得块");
            }
        };
        go(s2);
        //作为参数传给方法
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗游得块");
            }
        });
    }

    public static void go(Swimming s1) {
        System.out.println("=======开始========");
        s1.swim();
    }
}

interface Swimming {
    void swim();
}