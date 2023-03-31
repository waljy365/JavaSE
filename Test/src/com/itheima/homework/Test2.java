package com.itheima.homework;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : 王希辰
 * @date : 2023/3/4 20:16
 */
public class Test2 {
    public static void main(String[] args) {
        // 使用Stream流完成 , 把名字收集到map集合中作为键,字号作为map集合的值
        String[] names = {"刘备字玄德", "诸葛亮字孔明", "曹操字孟德", "孙权字仲谋", "关羽字云长", "张飞字翼德", "赵云字子龙", "乐进字文谦", "李典字曼成", "曹仁字子孝", "曹洪字子廉" };
        Map<String, String> map = Arrays.stream(names).collect(Collectors.toMap(s -> s.split("字")[0], s -> s.split("字")[1]));
        System.out.println(map);
    }
}
