package com.itheima.d6_object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
  目标：掌握对象字节输出流的使用：序列化对象。
 */
public class Test1ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c5.txt"));
        User u1 = new User("张三", "12456");
        User u2 = new User("张三", "12456");
        User u3 = new User("张三", "12456");
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        oos.writeObject(users);
        oos.close();
    }

}
