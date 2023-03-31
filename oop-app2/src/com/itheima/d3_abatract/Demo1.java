package com.itheima.d3_abatract;

/**
 * @author : 王希辰
 * @date : 2023/2/26 11:41
 */
public class Demo1 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.setName("mao ");
        a1.cry();
        Animal a2 = new Dog();
        a2.setName("gou ");
        a2.cry();
    }
}
