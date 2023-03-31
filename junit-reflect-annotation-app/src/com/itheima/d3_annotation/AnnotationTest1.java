package com.itheima.d3_annotation;
/*
    1 自定义注解 : 就是自己定义注解。
    2 注解的格式 :
    public @interface 注解名称 {
        public 属性类型 属性名() default 默认值;
    }
    特殊属性名： value
    如果注解中只有一个value属性，使用注解时，value名称可以不写!!
    需求 : 定义注解 , 使用注解修饰类中各种成分
 */
@MyAnno1("123")//注解中只有一个value属性不需要指出
public class AnnotationTest1 {
    @MyAnno(aa="123",cc={"123","456"})
    public void test1(){

    }

    public static void main(String[] args) {

    }
}
