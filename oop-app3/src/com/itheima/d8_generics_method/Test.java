package com.itheima.d8_generics_method;

import java.security.interfaces.RSAKey;
import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:47
 */
public class Test {
    public static void main(String[] args) {
        String s=test("java");
        System.out.println(s);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BENZ());
        cars.add(new BWM());
        go(cars);
        ArrayList<BWM> bwms = new ArrayList<>();
        go(bwms);
        ArrayList<Dog> dogs = new ArrayList<>();
        //go(dogs);
    }

    //? 一切类型 上限 extends Car （能接受car或其子类） 下限 super Car（能接受car或其父类）
    public static void go(ArrayList<? extends Car> cars) {

    }

    // public static <T extends Car> void go(ArrayList<T> cars) {
    //
    // }

    public static <T> T test(T t) {
        return t;
    }
}
