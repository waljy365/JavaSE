package com.itheima.d3_annotation;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
    目标：掌握注解的解析。

    AnnotatedElement接口提供了解析注解的方法
        public Annotation[] getDeclaredAnnotations()	获取当前对象上面的注解。
        public T getDeclaredAnnotation(Class<T> annotationClass)	获取指定的注解对象
        public boolean isAnnotationPresent(Class<Annotation> annotationClass)	判断当前对象上是否存在某个注解
 */
public class AnnotationTest3 {
    @Test
    public void parseClass(){
        Class demoC = Demo.class;
        if (demoC.isAnnotationPresent(MyAnno3.class)) {
            MyAnno3 myAnno3 = (MyAnno3) demoC.getDeclaredAnnotation(MyAnno3.class);
            System.out.println(Arrays.toString(myAnno3.value()));
            System.out.println(myAnno3.aa());
        }
    }

    @Test
    public void parseMethod() throws Exception {
        Class demoC = Demo.class;
        Method test = demoC.getDeclaredMethod("test");
        if (test.isAnnotationPresent(MyAnno3.class)) {
            MyAnno3 myAnno3 = (MyAnno3) test.getDeclaredAnnotation(MyAnno3.class);
            System.out.println(Arrays.toString(myAnno3.value()));
            System.out.println(myAnno3.aa());
        }
    }
}
