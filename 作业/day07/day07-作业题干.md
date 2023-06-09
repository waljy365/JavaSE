# 【TreeSet】

## 题目1

需求：

利用TreeSet实现以下需求：

1. 随机生成10个不同的0~50之间的整数，要求按照从小到大进行遍历。
2. 随机生成10个不同的50~100之间的整数，要求按照从大到小进行遍历。

思路分析：

TreeSet是具有排序特性的，默认按照自然排序。如果自然排序满足不了需求，可以使用自定义比较器。

需求1，可以使用自然排序实现；需求2可以使用自定义比较器实现 ,需要保证元素的唯一



答案：

```java

```

打印结果：

```

```



# 【Collections】

## 题目2

请定义一个可以存储“整数”的集合，并存储一些数据。

请按以下要求顺序编程实现：

1. 对集合中的数据打乱顺序；
1. 打印集合
1. 对集合中的数据进行升序排序
1. 打印集合
1. 对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
1. 打印集合

答案：

```java

```

打印结果：

```java

```



# 【Map集合】

## 题目3

请按以下要求顺序编码：

1. 定义一个：键Integer，值String类型的HashMap集合
1. 存储以下数据：”张三” , “李四” , “ 王五”。（put）
1. 打印集合大小；
1. 使用“键找值”的方式遍历集合，打印键和值；(keySet)
1. 使用“键值对”的方式遍历集合，打印键和值；(entrySet)
1. 获取键为1的值，并打印(get)
1. 获取键为10的值，并打印
1. 判断集合中是否有键：10（containsKey）
1. 删除键为1的键值对，删除完毕打印集合



答案：

```java

```



打印结果：

```

```





## 题目4

需求：研发部门有5个人，信息如下：（姓名-工资）【柳岩=2100, 张亮=1700, 诸葛亮=1800, 灭绝师太=2600, 东方不败 =3800】,将以上员工的相关信息存放在适合的集合中,给柳岩涨工资300,迭代出每个元素的内容输出到控制台。

思路：

- 使用HashMap存储数据
- 使用put方法进行对新增或者修改数据

答案：

```java

```

打印结果：

```

```



## 题目5

需求：使用LinkedHashMap保存学生对象，及其对应的家庭住址；要求：

1. 学生具有学号、姓名和成绩三个属性；
2. 其中，学号不能重复；

思路：

- 要重写hashCode和equals方法，学号不能重复，只要选中学号即可。

步骤：

1. 定义学生类包含学号、姓名和成绩三个属性；
2. 重写hashCode和equals方法，选中学号即可
3. 定义LinkedHashMap对象，键是学生对象，值是地址
4. 创建学生对象存入数据
5. 遍历查看结果

答案：

```java

```

打印结果：

张三和李四的学号一样，不能重复存储

```

```



## 题目6

需求：

1.利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量

2.如用户输入字符串:"helloworld java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)

3.注：输出结果不要求顺序一致

答案：

```java

```

打印结果：

```

```



# 【集合嵌套】

## 题目7

需求：一个年级有若干个班级，每个班级有若干个学生；要求：

1. 学生具有学号、姓名和成绩，学号和学生信息是一一对应的；
2. 使用集合保存这个年级的所有学生的信息，然后遍历输出；



思路：

- 班级：Map<Integer,Student> 键：学号，值：学生对象
- 年级：List<Map<Integer,Student>> 使用List集合将每个班级保存



答案：

```java

```



打印结果：

```java

```

