package com.itheima.d6_object_stream;

import java.io.Serializable;

/**
 * @author : 王希辰
 * @date : 2023/3/10 16:46
 */

/**
 * 1.User类会根据当前类信息生成一个序列号 666
 * 2.在对象序列化过程,序列化会随着对象一块写到文件中
 * 3.在反序列化前，修改了类信息，这个时候重新生成一个序列号 888
 * 4.再进行反序列化，数据类型转化的时候，会经文件中的序列号比较不上，抛出异常
 */
public class User implements Serializable {

    private String name;
    private transient String passowrd;//transient不参与序列化

    public User() {
    }

    public User(String name, String passowrd) {
        this.name = name;
        this.passowrd = passowrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passowrd='" + passowrd + '\'' +
                '}';
    }
}

