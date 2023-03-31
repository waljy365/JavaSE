package com.itheima.d7_generics_interface;

import com.itheima.d6_generics_class.Animal;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:36
 */
//泛型接口
//E K T V
// public interface Data <T extends Animal>{
public interface Data <T>{
    void add(T t);

    ArrayList<T> getByName(String name);
}
