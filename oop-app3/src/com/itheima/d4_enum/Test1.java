package com.itheima.d4_enum;

/**
 * @author : 王希辰
 * @date : 2023/2/27 10:57
 */
public class Test1 {
    public static void main(String[] args) {
        //限定参数，为枚举类型，且只有两个对象
        provideInfo(Constant.BOY);
    }
    public static void provideInfo(Constant sex) {
        switch (sex) {
            case BOY:
                System.out.println("男");break;
            case GIRL:
                System.out.println("女");break;
        }
    }
}
