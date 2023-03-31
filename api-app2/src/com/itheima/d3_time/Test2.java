package com.itheima.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 王希辰
 * @date : 2023/2/27 20:08
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 目标：掌握SimpleDateFormat的使用
        // 1.准备一些时间
        Date d = new Date();
        System.out.println(d);
        long l = d.getTime();
        System.out.println(l);
        // 2.格式化日期对象，和时间 毫秒值
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(format.format(d));
        System.out.println(format.format(l));

        // 目标：掌握SimpleDateFormat解析字符串时间 成为日期对象。
        String datestr = "2023-12-12 12:12:12";
        // 1.创建简单日期格式化对象，指定的时间格式必须与被解析的时间格式一模一样，否则程序会出bug.
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = format1.parse(datestr);
        System.out.println(d2);
    }
}
