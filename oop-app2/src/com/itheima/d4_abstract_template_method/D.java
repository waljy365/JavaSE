package com.itheima.d4_abstract_template_method;

/**
 * @author : 王希辰
 * @date : 2023/2/26 12:04
 */
public abstract class D {
    //模板方法
    public final void sing() {
        System.out.println("开始唱");
        tosing();
        System.out.println("唱完了");
    }
    //抽象方法交给子类完成
    public abstract void tosing();
}
