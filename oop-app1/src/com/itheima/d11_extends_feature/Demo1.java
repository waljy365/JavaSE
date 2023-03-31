package com.itheima.d11_extends_feature;

/**
 * @author : 王希辰
 * @date : 2023/2/25 12:13
 */
public class Demo1 {
    public static void main(String[] args) {
        A a = new A();
        a.hashCode();
        D d = new D();
        d.hashCode();
    }
}
//单继承，支持多层继承。
class A {

}
class B{}
class C{}
class D extends A{

}
class E extends D{

}