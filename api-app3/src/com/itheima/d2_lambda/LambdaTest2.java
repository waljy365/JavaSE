package com.itheima.d2_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

/*
    1 对之前的代码使用lambda表达式优化

    2 Lambda表达式的省略写法(进一步简化Lambda表达式的写法)
        1) 参数类型可以省略不写。
        2) 如果只有一个参数，参数类型可以省略，同时()也可以省略。
        3) 如果Lambda表达式中的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
           此时，如果这行代码是return语句，也必须去掉return不写。
 */
public class LambdaTest2 {
    public static void main(String[] args) {
/*        double[] prices = {99.8, 128, 100};

        Arrays.setAll(prices,(int value) ->{
                return prices[value] * 0.5;
        });
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 162.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);
        Arrays.sort(students, (Student o1, Student o2) ->{
                return o1.getAge() - o2.getAge() == 0 ? (o2.getHeight() - o1.getHeight()>0?1:-1) : (o1.getAge() - o2.getAge());
        });*/
        double[] prices = {99.8, 128, 100};

        Arrays.setAll(prices,value ->
             prices[value] * 0.5
        );
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 162.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);
        Arrays.sort(students, ( o1,  o2) ->
             o1.getAge() - o2.getAge() == 0 ? (o2.getHeight() - o1.getHeight()>0?1:-1) : (o1.getAge() - o2.getAge())
        );

    }

}
