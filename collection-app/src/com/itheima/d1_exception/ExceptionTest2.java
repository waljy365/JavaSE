package com.itheima.d1_exception;

/**
 * 目标：掌握自定义异常，以及异常的作用。
 * <p>
 * 自定义异常
 * 自定义运行时异常
 * 1 定义一个异常类继承RuntimeException.
 * 2 生成构造器。
 * 3 通过throw new 异常类(xxx)来创建异常对象并抛出。
 * 编译阶段不报错，提醒不强烈，运行时才可能出现！！
 * 自定义编译时异常
 * 1 定义一个异常类继承Exception.
 * 2 生成构造器。
 * 3 通过throw new 异常类(xxx)来创建异常对象并抛出。
 * 编译阶段就报错，提醒更加强烈！
 * 异常有什么作用
 * 检测系统出现问题关键的参考信息
 * 异常可以作为方法内部的一种特殊返回值,以便通知上层调用者底层的情况
 * <p>
 * 需求 : 定义方法接收年龄, 验证此年龄是否合法,如果年龄不合法抛出自定义异常
 */
public class ExceptionTest2 {
    /**
     * 扩展
     * 1.异常的处理方式
     * 1）jvm 把异常信息 以红色字体打印到控制台,结束当前程序
     * 2.自己处理
     * 直接抛出
     * try{..}catch{..}
     * 2.捕获异常执行过程
     * try{..}catch{..}
     * 如果捕获到异常，catch块去匹配。匹配上之后，后续代码会执行，try中抛异常的代码之后不会执行
     * 如果没有捕获到异常，try中代码全部执行，catch不执行
     * 3.异常对象常见方法
     * e.printStackTrace(); 打印异常信息
     * getMassage()返回异常原因
     * 抛出和捕获异常支持多态
     * @param args
     */
    public static void main(String[] args) {

        try {
            judgeAge(200);
        } catch (AgeOutBoundsException e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

    public static void judgeAge(int age) throws AgeOutBoundsException {
        if (age > 0 && age < 150) {
            System.out.println("年龄合法");
        } else {
            throw new AgeOutBoundsException("年龄不合法");
        }
    }
}
