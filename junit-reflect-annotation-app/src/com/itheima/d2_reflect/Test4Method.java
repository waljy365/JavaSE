package com.itheima.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    目标：掌握获取类的成员方法，并对其进行操作。

    Class类中的方法
        Method[] getMethods()	获取类的全部成员方法（只能获取public修饰的）
        Method[] getDeclaredMethods()	获取类的全部成员方法（只要存在就能拿到）
        Method getMethod(String name, Class<?>... parameterTypes) 	获取类的某个成员方法（只能获取public修饰的）
        Method getDeclaredMethod(String name, Class<?>... parameterTypes)	获取类的某个成员方法（只要存在就能拿到）
    Method提供的方法
        public Object invoke(Object obj, Object... args)	触发某个对象的该方法执行。
        public void  setAccessible(boolean flag)	设置为true，表示禁止检查访问控制（暴力反射）
 */
public class Test4Method {
    @Test
    public void testGetMethods() {
        // 1.获取字节码对象
        Class catClass = Cat.class;
        // 2.获取所有成员方法
        Method[] declaredMethods = catClass.getDeclaredMethods();
        // 3.循环遍历所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()
                    +"-->"+declaredMethod.getParameterCount()+
                    "-->"+declaredMethod.getReturnType());
        }
    }
    @Test
    public void testGetMethod() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1.获取字节码对象
        Class Ccat = Cat.class;
        // 创建
        Constructor declaredConstructor = Ccat.getDeclaredConstructor();
        Cat cat = (Cat) declaredConstructor.newInstance();
        // 2.获取成员方法
        Method Meat = Ccat.getDeclaredMethod("eat");
        System.out.println(Meat.getName()+
                "-->"+Meat.getParameterCount()+
                "-->"+Meat.getReturnType());
        // 3.方法调用eat无参
        System.out.println(Meat.invoke(cat));
        // 调用eat带参返回值
        Method eat = Ccat.getDeclaredMethod("eat", String.class);
        eat.setAccessible(true);
        System.out.println(eat.invoke(cat,"fish"));
    }
}
