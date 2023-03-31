# 一 选择题

### 题目1(多选):

**下列关于Stream流中获取功能有哪些( ABD )**

#### 选项 :

	A. Collection接口中的默认方法stream()生成流
	B. Map接口中的默认方法stream()生成流
	C. Arrays中的静态方法stream生成流
	D. Stream类中of方法生成流

### 题目2(多选):

**下列关于Stream流中中间功能有哪些( ABD )**

#### 选项 :

	A. filter()方法用于对流中的数据进行过滤
	B. sorted()方法将流中元素进行排序
	C. collector()方法收集流中的数据
	D. limit()方法截取指定参数个数的数据

### 题目3(多选):

**下列关于Stream流中终结功能有哪些(ABC )**

#### 选项 :

	A. forEach()方法对流中的元素遍历
	B. count()方法返回此流中的元素数
	C. skip()方法跳过指定参数个数的数据
	D. collector()方法收集流中的数据

### 题目4(单选):

**观察以下Stream流代码,最终输出的结果为( A )**

```
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张翠山", "张无忌", "张三", "赵四");
        long count = list.stream().filter(s -> s.length() == 3).skip(2).count();
        System.out.println(count);
    }
}
```

#### 选项 :

	A. 1
	B. 2	
	C. 张翠山 , 张无忌	
	D. 张无忌

### 题目5(单选):

**关于下列File的功能描述错误的是(B  )**

#### 选项 :

	A. createNewFile()用于创建文件的方法
	B. delete()只能删除文件
	C. isFile()用于判断是否是一个文件
	D. getAbsolutePath()获取文件的绝对路径



### 题目6(单选):

**对于下列递归删除一个文件夹的代码补全( C )**

```java
public class Demo {
    public static void main(String[] args) {
        File f = new File("D:\\aaa");
        deleteFiles(f);
    }

    private static void deleteFiles(File f) {
        File[] files = f.__位置1__();

        for (File file : files) {
            if (file.__位置2__()) {
                // 递归
                deleteFiles(file);
            } else {
                // 删除文件
                file.__位置3__();
            }
        }
        // 删除当前文件夹
        f.__位置4__();
    }
}
```

#### 选项 :

	A. 位置1:listFiles 	位置2:isFile		位置3:delete	位置4:remove
	B. 位置1:list	        位置2:isDirectory	位置3:delete	位置4:delete
	C. 位置1:listFiles 	位置2:isDirectory	位置3:delete	位置4:delete
	D. 位置1:listFiles 	位置2:isFile		位置3:delete	位置4:remove

# 

# 二 编程题【Stream】

## 题目1

现在有两个`ArrayList`集合存储队伍当中的多个成员姓名，要求使用Stream流**依次**进行以下若干操作步骤：

1. 第一个队伍只要名字为3个字的成员姓名；
2. 第一个队伍筛选之后只要前3个人；
3. 第二个队伍只要姓张的成员姓名；
4. 第二个队伍筛选之后不要前2个人；
5. 将两个队伍合并为一个队伍；
6. 根据姓名创建`Person`对象；
7. 打印整个队伍的Person对象信息。

两个队伍（集合）的代码如下：

```java
public class DemoArrayListNames {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("黄老邪");
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        List<String> two = new ArrayList<>();
        two.add("张三丰");
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
		// ....
    }
}
```

而`Person`类的代码为：

```java
public class Person {
    
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```



## 题目2

```
某学校Java学科分为基础班和就业班:
Java基础班:
  001	李晨
  002	范冰冰
Java就业班:
  001	马云
  002	马化腾
使用HashMap嵌套HashMap方式完成存储数据,并遍历出所有的学生
```

### 训练目标

```
HashMap的嵌套(HashMap嵌套HashMap)
```

### 训练提示

```
1.每个学生的学号和姓名就是一个键值对,可以放在一个map集合中
2.Java基础班对应着存放学号和姓名的map集合
3.先遍历出外面的Map集合,拿到内部的Map集合
4.再遍历内部的Map和,将具体的key和value获取出来
```

### 参考方案

```java

```

## 题目三

```java
现有数据 : 刘备字玄德 诸葛亮字孔明 曹操字孟德 孙权字仲谋 关羽字云长 张飞字翼德 赵云字子龙 乐进字文谦 李典字曼成 曹仁字子孝 曹洪字子廉

需求 : 使用Stream流完成 , 把名字收集到map集合中作为键,字号作为map集合的值
```

