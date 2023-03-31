package com.itheima.d4_enum;

/**
 * @author : 王希辰
 * @date : 2023/2/28 11:57
 */
public class Test1 {
    public static void main(String[] args) {
        showInfo(Gender.BOY);
    }

    public static void showInfo(Gender gender) {
        switch (gender) {
            case BOY: {
                System.out.println("男生");break;
            }
            case GIRL: {
                System.out.println("女生");break;
            }
        }
    }
}
