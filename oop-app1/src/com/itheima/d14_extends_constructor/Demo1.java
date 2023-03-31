package com.itheima.d14_extends_constructor;

/**
 * @author : 王希辰
 * @date : 2023/2/25 16:08
 */
public class Demo1 {
    public static void main(String[] args) {
        B b = new B("12");
    }
}

class A {
    public A() {
        System.out.println("父类的无参构造");
    }
    //有参构造
    public A(int a) {
        System.out.println("父类的有参构造");
    }
}

class B extends A {
    String name;

    public B(String name) {
        //super();
        super(2);
        System.out.println("子类的有参构造");
    }
    public B() {
        //super();//调用父类的无参构造
        super(10);
        System.out.println("子类的无参构造");
    }
}
