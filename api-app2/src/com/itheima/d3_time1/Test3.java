package com.itheima.d3_time1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author : 王希辰
 * @date : 2023/3/1 16:00
 */
public class Test3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DATE, 10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.MONTH, 1);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
}
