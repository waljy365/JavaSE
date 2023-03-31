package com.itheima.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayListNames {
    public static void main(String[] args) {
        /*
        *   1. 第一个队伍只要名字为3个字的成员姓名；
            2. 第一个队伍筛选之后只要前3个人；
            3. 第二个队伍只要姓张的成员姓名；
            4. 第二个队伍筛选之后不要前2个人；
            5. 将两个队伍合并为一个队伍；
            6. 根据姓名创建`Person`对象；
            7. 打印整个队伍的Person对象信息。
        * */
        List<String> one = new ArrayList<>();
        one.add("黄老邪");
        one.add("陈玄风");
        one.add("梅超风");
        one.add("陆乘风");
        one.add("曲灵风");
        one.add("武眠风");
        one.add("冯默风");
        one.add("罗玉风");
        Stream<String> s1 = one.stream().filter(a -> a.length() == 3).limit(3);
        List<String> two = new ArrayList<>();
        two.add("张三丰");
        two.add("宋远桥");
        two.add("俞莲舟");
        two.add("俞岱岩");
        two.add("张松溪");
        two.add("张翠山");
        two.add("殷梨亭");
        two.add("莫声谷");
        Stream<String> s2 = two.stream().filter(a -> a.startsWith("张")).skip(2);
        Stream.concat(s1, s2).map(Person::new).forEach(System.out::println);
    }
}