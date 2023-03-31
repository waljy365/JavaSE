package com.itheima.d4_enum;

import javax.xml.transform.Source;

/**
 * @author : 王希辰
 * @date : 2023/2/28 11:28
 */
public class Test {
    public static void main(String[] args) {
        A x = A.X;
        // A.X = null;//常量
        System.out.println(x instanceof A);
        A y= A.Z;
        System.out.println(y.ordinal());
        B obj = B.OBJ;
        obj.show();
    }
}
