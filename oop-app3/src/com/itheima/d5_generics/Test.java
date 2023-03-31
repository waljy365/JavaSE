package com.itheima.d5_generics;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:12
 */
public class Test {
    public static void main(String[] args) {
        //没有泛型
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(new Cat());
        //定义泛型
        ArrayList<String> list1 = new ArrayList();//右边不用定义类型，从jdk1.7开始
        list1.add("111");
        list1.add("222");
        list1.add("333");
        // list1.add(new Cat());
    }
}

class Cat {

}
