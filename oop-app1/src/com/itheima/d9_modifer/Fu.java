package com.itheima.d9_modifer;

/**
 * @author : 王希辰
 * @date : 2023/2/25 11:52
 */
public class Fu {
    public void publicMethod() {
        System.out.println("publicMethod");
    }
    void method() {
        System.out.println("method");
    }
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    public void test() {
        publicMethod();
        privateMethod();
        method();
        protectedMethod();
    }
}
