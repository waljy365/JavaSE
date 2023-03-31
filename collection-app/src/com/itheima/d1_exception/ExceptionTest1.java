package com.itheima.d1_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：认识异常。
 *      1 什么是异常
 *          异常就是代表程序出现了问题
 *      2 异常的体系
 *        Throwable
 *          Error
 *          Exception
 *              RuntimeException及其子类
 *              非RuntimeException及其子类
 *      3 Exception：叫异常，它代表的才是我们程序可能出现的问题，所以，我们程序员通常会用Exception以及它的孩子来封装程序出现的问题。
 *          运行时异常：RuntimeException及其子类，编译阶段不会出现错误提醒，运行时出现的异常（如：数组索引越界异常）
 *          编译时异常：编译阶段就会出现错误提醒的。（如：日期解析异常）
 *
 *      需求 :
 *          1 演示运行时期异常
 *          2 演示编译时期异常
 *          3 处理的方案
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        //运行时异常
        // System.out.println(Integer.valueOf("12a"));
        //编译时异常
        //1.throw
        //2.try catch
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            String d = "2000-02-03";
            Date date = format.parse(d);
        } catch (ParseException e) {

            throw new RuntimeException(e);
        }
    }
}