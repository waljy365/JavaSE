package com.itheima.d3_time1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : 王希辰
 * @date : 2023/3/1 15:39
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 目标: 完成秒杀案例。
        // 1、把开始时间、结束时间、小贾下单时间、小皮下单时间拿到程序中来。String start = "2023年11月11日 0:0:0;String end ="2023年11月11日 0:10:0":String xj = "2023年11月11日 0:01:18"String xp = "2023年11月11日 0:10:57"
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";
        // 2、把字符串的时间解析成日期对象。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date xjDt = sdf.parse(xj);
        Date xpDt = sdf.parse(xp);
        // 3、开始判断小皮和小贾是否秒杀成功了。
        // 把日期对象转换成时间毫秒值来判断
        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long xjTime = xjDt.getTime();
        long xpTime = xpDt.getTime();
        if (xjTime > startTime && xjTime <= endTime) {
            System.out.println("小嘉秒杀成功");
        } else {
            System.out.println("小嘉秒杀失败");
        }
        if (xpTime > startTime && xpTime <= endTime) {
            System.out.println("小皮秒杀成功");
        } else {
            System.out.println("小皮秒杀失败");
        }
    }
}
