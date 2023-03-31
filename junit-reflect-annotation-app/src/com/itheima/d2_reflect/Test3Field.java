package com.itheima.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
     目标：掌握获取类的成员变量，并对其进行操作。

     Class类中方法
        public Field[] getFields()	获取类的全部成员变量（只能获取public修饰的）
        public Field[] getDeclaredFields()	获取类的全部成员变量（只要存在就能拿到）
        public Field getField(String name)	获取类的某个成员变量（只能获取public修饰的）
        public Field getDeclaredField(String name)	获取类的某个成员变量（只要存在就能拿到）
    Field类中的方法
        void set(Object obj, Object value)：	赋值
        Object get(Object obj)	取值
        public void  setAccessible(boolean flag)	设置为true，表示禁止检查访问控制（暴力反射）

   需求 : 操作猫类的成员变量
 */
public class Test3Field {
    @Test
    public void testGetFields() throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1.获取字节码对象
        Class catClass = Cat.class;
        Constructor declaredConstructor = catClass.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        // 2.获取所有的成员变量
        Field[] declaredFields = catClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+"--->"+declaredField.getType());
        }
        // 获取单个name
        Cat cat = (Cat) declaredConstructor.newInstance("itheima",23);// 随便写然后覆盖
        Field name = catClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(cat,"123");
        String name1 = (String) name.get(cat);
        System.out.println(name1);
    }
}
