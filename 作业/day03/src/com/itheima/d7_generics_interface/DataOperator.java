package com.itheima.d7_generics_interface;

import java.util.ArrayList;

/**
 * @author : 王希辰
 * @date : 2023/2/28 15:11
 */
public interface DataOperator<T> {
    //打印信息
    public void printAll(ArrayList<T> list);

    //打印平均成绩
    public void printAvg(ArrayList<T> list);
}
