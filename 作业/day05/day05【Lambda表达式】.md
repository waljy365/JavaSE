

# 【Lambda】

## 【简答】

**简单题不在每日反馈中，请同学们以文档形式提交给授课老师**

1. 请简述Lambda的使用前提条件？

   ```
   
   ```

2. 什么叫做函数式接口

   ```
   
   ```

3. 请说出Lambda表达式的格式

   ```
   
   ```
   
4. 请说出Lambda表达式参数和函数体的简化规则

   ```
   
   ```



   


## 【编码】



### 题目1

```java
/*
    Lambda表达式的使用前提 :
        1 有一个接口
        2 接口中有且仅有一个抽象方法

    练习1：
        1 编写一个接口（ShowHandler）
        2 在该接口中存在一个抽象方法（show），该方法是无参数无返回值
        3 在测试类（ShowHandlerDemo）中存在一个方法（useShowHandler），方法的的参数是ShowHandler类型的，在方法内部调用了ShowHandler的show方法
 */
public class LambdaTest1 {

}

```



答案：

```java

```



### 题目2

```java
/*
    1 首先存在一个接口（StringHandler）
    2 在该接口中存在一个抽象方法（printMessage），该方法是有参数无返回值
    3 在测试类（StringHandlerDemo）中存在一个方法（useStringHandler），
        方法的的参数是StringHandler类型的，
        在方法内部调用了StringHandler的printMessage方法
 */
public class LambdaTest2 {

}
```

答案：

```java

```



### 题目3

```java
/*
    1 首先存在一个接口（RandomNumHandler）
    2 在该接口中存在一个抽象方法（getNumber），该方法是无参数但是有返回值
    3 在测试类（RandomNumHandlerDemo）中存在一个方法（useRandomNumHandler），方法的的参数是RandomNumHandler类型的
        在方法内部调用了RandomNumHandler的getNumber方法
 */
public class LambdaTest3 {

}
```

答案

```java
```



### 题目4

```java
/*
    1 首先存在一个接口（Calculator）
    2 在该接口中存在一个抽象方法（calc），该方法是有参数也有返回值
    3 在测试类（CalculatorDemo）中存在一个方法（useCalculator）
        方法的的参数是Calculator类型的
        在方法内部调用了Calculator的calc方法
 */
public class LambdaTest4 {
}

```

答案

```java

```



### 题目5

```java
把以上四个案例中所有用到的lambda表达式,进行简化
```



