package com.itheima.d1_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：异常的处理
 *
 * 需求 : 程序存在多异常 , 如何处理 ?
 */
public class ExceptionTest3 {
    public static void main(String[] args)  {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("要找的文件不存在");
        } catch (ParseException e) {
            System.out.println("时间格式不正确");
        }
    }

   public static void test1() throws FileNotFoundException, ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       Date d = sdf.parse("2028-11-11 10:24:11");
       System.out.println(d);
       test2();
   }

   public static void test2() throws FileNotFoundException {
       // 读取文件的。
       InputStream is = new FileInputStream("D:/meinv.png");
   }
}
