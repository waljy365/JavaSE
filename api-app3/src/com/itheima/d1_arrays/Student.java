package com.itheima.d1_arrays;

/*
       根据compareTo方法的返回值进行指定元素位置
            如果返回值为负数，表示当前存入的元素是较小值，存左边
            如果返回值为0，表示当前存入的元素相等 , 位置不动
            如果返回值为正数，表示当前存入的元素是较大值，存右边
        this表示当前要存储的元素 , o表示的是已经存在的元素 , 会拿到要排序的元素从左往右依次比较进行存储位置
*/
public class Student implements Comparable<Student> {
    private String name;
    private double height;
    private int age;

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }
}
