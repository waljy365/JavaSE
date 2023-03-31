package com.itheima.d6_generics_class;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:22
 */
public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int size;
    public boolean add(E e) {
        arr[size++] = e;
        return true;
    }

    public E get(int index) {
        return (E)arr[index];
    }
}
