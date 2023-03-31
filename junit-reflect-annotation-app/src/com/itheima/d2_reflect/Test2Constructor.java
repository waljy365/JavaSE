package com.itheima.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/*
    目标：掌握获取类的构造器，并对其进行操作。

    Class类中方法
        Constructor<?>[] getConstructors()	获取全部构造器（只能获取public修饰的）
        Constructor<?>[] getDeclaredConstructors()	获取全部构造器（只要存在就能拿到）
        Constructor<T> getConstructor(Class<?>... parameterTypes)	获取某个构造器（只能获取public修饰的）
        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)	获取某个构造器（只要存在就能拿到）
    Constructor提供的方法
        T newInstance(Object... initargs)	调用此构造器对象表示的构造器，并传入参数，完成对象的初始化并返回
        public void  setAccessible(boolean flag)	设置为true，表示禁止检查访问控制（暴力反射）

    需求 : 操作猫类的构造器
 */
public class Test2Constructor {
    @Test
    public void testGetConstructors(){
        // 1、反射第一步：必须先得到这个类的Class对象
        Class catClass = Cat.class;
        // 2、获取类的全部构造器
        Constructor[] catClassConstructors = catClass.getConstructors();
        // 3、遍历数组中的每个构造器对象
        for (Constructor constructor : catClassConstructors) {
            System.out.println(constructor);
            System.out.println(constructor.getName()
                    +"--->"+constructor.getParameterCount()
                    );
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        // 1、反射第一步：必须先得到这个类的Class对象
        Class catClass = Cat.class;
        // 2、获取类的某个构造器：无参数构造器
        Constructor constructor = catClass.getConstructor();
        Cat cat = (Cat) constructor.newInstance();
        // 3、获取类的某个构造器：获取有参数构造器
        Constructor constructor1 = catClass.getDeclaredConstructor(String.class,int.class);
        // 有参构造器是私有的需要暴力反射
        constructor1.setAccessible(true);
        constructor1.newInstance("wxc", 23);
    }
}





