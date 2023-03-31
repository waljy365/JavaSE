package com.itheima.d2_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author : 王希辰
 * @date : 2023/3/1 12:07
 */
public class Test1 {
    public static void main(String[] args) {
        double total=158.3;
        double count = 7;
        BigDecimal divide = BigDecimal.valueOf(Double.valueOf(total)).divide(BigDecimal.valueOf(Double.valueOf(count)),2, RoundingMode.HALF_UP);
        System.out.println(divide.doubleValue());
    }
}