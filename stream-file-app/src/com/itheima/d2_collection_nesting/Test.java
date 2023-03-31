package com.itheima.d2_collection_nesting;

import java.util.HashMap;
import java.util.function.BiConsumer;

/*
      目标：理解集合的嵌套。
      江苏省 = "南京市","扬州市","苏州市“,"无锡市","常州市"
      湖北省 = "武汉市","孝感市","十堰市","宜昌市","鄂州市"
      河北省 = "石家庄市","唐山市", "邢台市", "保定市", "张家口市"
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String[]> map = new HashMap<>();
        map.put("江苏省",new String[]{"南京市","扬州市","苏州市","无锡市","常州市"});
        map.put("湖北省",new String[]{"武汉市","孝感市","十堰市","宜昌市","鄂州市"});
        map.put("河北省",new String[]{"石家庄市","唐山市", "邢台市", "保定市", "张家口市"});
        map.forEach(new BiConsumer<String, String[]>() {
            @Override
            public void accept(String s, String[] strings) {
                System.out.println("省份："+s);
                for (String string : strings) {
                    System.out.println(string);
                }
            }
        });
    }
}
