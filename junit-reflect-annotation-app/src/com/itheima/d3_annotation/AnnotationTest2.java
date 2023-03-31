package com.itheima.d3_annotation;

/*
     目标：认识元注解，搞清楚元注解的作用。

     @Target
        作用：声明被修饰的注解只能在哪些位置使用
        @Target(ElementType.TYPE)
        TYPE，类，接口
        FIELD, 成员变量
        METHOD, 成员方法
        PARAMETER, 方法参数
        CONSTRUCTOR, 构造器
        LOCAL_VARIABLE, 局部变量
     @Retention
        作用：声明注解的保留周期。
        @Retention(RetentionPolicy.RUNTIME)
        1. SOURCE
            只作用在源码阶段，字节码文件中不存在。
        2. CLASS（默认值）
            保留到字节码文件阶段，运行阶段不存在.
        3. RUNTIME（开发常用）
            一直保留到运行阶段。
 */
@MyAnno2(aa="a",value = "123")
public class AnnotationTest2 {
    @MyAnno2(aa="a",value = "123")
    public String name;
}
