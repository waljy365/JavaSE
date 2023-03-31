package com.itheima.d3_time1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 王希辰
 * @date : 2023/3/1 15:08
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
        //date转字符串
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long l = date.getTime();
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(l));
        //字符串转date
        String str = "2023-12-12";
        System.out.println(simpleDateFormat.parse(str));
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        System.out.println(simpleDateFormat1.format(date1));
        String str1 = "2023/03/01 10:10:10";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(simpleDateFormat2.parse(str1));

    }
}
