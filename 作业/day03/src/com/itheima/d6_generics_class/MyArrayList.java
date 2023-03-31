package com.itheima.d6_generics_class;


/**
 * @author : 王希辰
 * @date : 2023/2/28 14:52
 */

/**
 * 一个类型变量
 * @param <E>
 */
public class MyArrayList <E>{
    public Object[] arr = new Object[10];

    public boolean add(E e) {
        return true;
    }

    public E get(int i) {
        return null;
    }

}
