package com.itheima.d3_stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
   目标 : 初步体验Stream流的方便与快捷

   需求 : 把集合中所有以“张”开头，且是3个字的元素存储到一个新的集合。
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");

        List<String> names1 = new ArrayList<>();
        names.forEach((s)->{if(s.startsWith("张")&&s.length()==3){
            names1.add(s);
        }});
        names1.forEach((s)->{
            System.out.println(s);
        });
        System.out.println("----------------");
        Stream<String> stream = names.stream();
        stream.filter(s -> s.startsWith("张")&&s.length()==3).forEach(System.out::println);
    }
}
