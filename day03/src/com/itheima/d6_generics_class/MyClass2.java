package com.itheima.d6_generics_class;

/**
 * @author : 王希辰
 * @date : 2023/2/28 14:54
 */

/**
 * 限制输入类型为动物类及其子类
 * @param <E>
 */
public class MyClass2 <E extends Animal>{
    public void test(E e) {

    }
}
