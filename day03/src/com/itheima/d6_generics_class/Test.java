package com.itheima.d6_generics_class;

/**
 * @author : 王希辰
 * @date : 2023/2/28 14:51
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList();
        list.add("java");
        MyClass<String,String> myClass = new MyClass();
        MyClass2<Dog> myClass2 = new MyClass2();
        //MyClass2<Cat> myClass3 = new MyClass2();//没有继承不能使用
    }
}
