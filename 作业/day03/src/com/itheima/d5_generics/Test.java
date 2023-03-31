package com.itheima.d5_generics;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author : 王希辰
 * @date : 2023/2/27 11:12
 */
public class Test {
    public static void main(String[] args) {
        //没有泛型 任何类型都能添加 获取为Object需要强转,可能发生异常
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add(new Cat());
        //定义泛型 只能添加String
        ArrayList<String> list1 = new ArrayList();//右边不用定义类型，从jdk1.7开始
        list1.add("111");
        list1.add("222");
        list1.add("333");
        // list1.add(new Cat());
    }
}

class Cat {

}
