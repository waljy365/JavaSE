package com.itheima.d6_generics_class;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:22
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("ajva");
        list.add("ajva");
        list.add("ajva");
        list.add("ajva");
        String ele=list.get(1);
        System.out.println(ele);
        MyClass<String,String > list1 = new MyClass<>();
        //必须传动物类或的动物的子类
        //MyClass2<String> list2 = new MyClass2<>();
    }
}
