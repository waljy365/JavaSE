package com.itheima.d2_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : 王希辰
 * @date : 2023/2/27 19:26
 */
public class Test {
    public static void main(String[] args) {
        // 浮点型运算时, 直接+ - * / 可能会出现运算结果失真
        // System.out.println(0.1 + 0.2);
        // System.out.println(1.0 - 0.32);
        // System.out.println(1.015 * 100);
        // System.out.println(1.301 / 100);

        //目标：掌握BigDecimal进行进行精确运算的方案
        double a = 0.1;
        double b = 0.2;
        // 1.把浮点型数据封装成BigDecimal对象，再来参与运算
        // a.public BigDecimal(double val) 得到的BigDecimal对象是无法精确计算浮点型数据的。注意：不推荐使用这个
        // b.public BigDecimal(String val) 得到的BigDecimal对象是可以精确计算浮点型数据的。可以使用
        // c.public static BigDecimal valueOf(double val) 通过这个静态方法得到的BigDecimal对象是可以精确运算的。是最好的方案。
        // BigDecimal a1=new BigDecimal(a);
        // BigDecimal b1=new BigDecimal(b);

        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        // 2.public BigDecimal add(BigDecimal augend) 加法
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);
        // 3.public BigDecimal subtract(BigDecimal augend) 减法
        BigDecimal d1=a1.subtract(b1);
        System.out.println(d1);
        // 4.public BigDecimal multiply(BigDecimal augend) 乘法
        BigDecimal e1=a1.multiply(b1);
        System.out.println(e1);
        // 5.public BigDecimal divide(BigDecimal b) 除法
        BigDecimal f1=a1.divide(b1);
        System.out.println(f1);

        // BigDecimal c3=BigDecimal.valueOf(0.1);
        // BigDecimal c4=BigDecimal.valueOf(0.3);
        // BigDecimal c5 = c3.divide(c4);//不精确，报错
        // System.out.println(c5);

        // 6.public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式)除法，可以设置精确几位。
        BigDecimal c3=BigDecimal.valueOf(0.1);
        BigDecimal c4=BigDecimal.valueOf(0.3);
        BigDecimal c5 = c3.divide(c4,2, RoundingMode.HALF_UP);//0.33
        System.out.println(c5);

        // 7.public double doubleValue():把BigDecimal对象又转换成double类型的数据。
        // print(a1);
        // print(b1);
        double a11 = a1.doubleValue();
        double b11 = b1.doubleValue();
        print(a11);
        print(b11);
    }

    public static void print(double a) {
        System.out.println(a);
    }
}