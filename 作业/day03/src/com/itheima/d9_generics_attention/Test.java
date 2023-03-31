package com.itheima.d9_generics_attention;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/27 12:57
 */
public class Test {
    public static void main(String[] args) {
        //1.泛型是工作在编译阶段的，一点程序编译成class文件,class文件中就不存在泛型了,这就是泛型擦除。
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        String rs = list.get(2);
        //2.泛型不支持基本数据类型，只支持对象类型（引用数据类型）
    }
}
