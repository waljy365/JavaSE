package com.itheima.d6_object_stream;

import java.io.*;
import java.util.ArrayList;

/*
  目标：掌握对象字节输入流的使用：反序列化对象。
 */
public class Test2ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c5.txt"));
        ArrayList<User> list = (ArrayList<User>) ois.readObject();
        list.forEach(System.out::println);
        ois.close();
    }

}
