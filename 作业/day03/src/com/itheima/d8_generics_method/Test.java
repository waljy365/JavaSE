package com.itheima.d8_generics_method;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:47
 */
public class Test {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BENZ());
        cars.add(new BWM());
        go1(cars);
        ArrayList<BWM> bwms = new ArrayList<>();
        ArrayList<BENZ> benzs = new ArrayList<>();
        go1(bwms);
        go1(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        go1(dogs);
    }
    //泛型方法
    public static <T> void go1(T t) {

    }
    //泛型方法
    public static <T extends Car> void go2(ArrayList<T> cars) {

    }

    /**
     * 泛型方法 ? 一切类型 上限 extends Car （能接受car或其子类） 下限 super Car（能接受car或其父类）
     * @param cars
     */
    public static void go3(ArrayList<? extends Car> cars) {

    }

    /**
     * 泛型方法 ? 一切类型 上限 extends Car （能接受car或其子类） 下限 super Car（能接受car或其父类）
     * @param cars
     */
    public static void go4(ArrayList<? extends Car> cars) {

    }




}
