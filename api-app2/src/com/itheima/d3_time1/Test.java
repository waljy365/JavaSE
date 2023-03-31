package com.itheima.d3_time1;

import java.util.Date;

/**
 * @author : 王希辰
 * @date : 2023/3/1 14:45
 */
public class Test {
    public static void main(String[] args) {
        //获取系统时间
        Date date1 = new Date();
        System.out.println(date1);
        //拿到毫秒值
        long l = date1.getTime();
        System.out.println(l);
        //毫秒值转对象
        Date date2 = new Date(l);
        System.out.println(date2);
        //修改日期对象
        date2.setTime(l);
        System.out.println(date2);



        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
        long time1= time+1000*60*5;
        System.out.println(time1);
        date.setTime(time1);
        System.out.println(date);
    }
}
