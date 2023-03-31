package com.itheima.d6_map_traverse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.function.BiConsumer;

/*
     目标：完成Map集合的案例：统计投票人数。

     需求
        某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A、B、C、D）
        每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

     分析
        将80个学生选择的数据拿到程序中去，[A,A,B,A,B,C,D,...]
        准备一个Map集合用于存储统计的结果，Map<String，Integer>，键是景点，值代表投票数量。
        遍历80个学生选择的景点，每遍历一个景点，就看Map集合中是否存在该景点，不存在存入“景点=1“，存在则其对应值+1,
 */
public class MapDemo4 {
    public static void main(String[] args) {
        String[] select = new String[80];
        String content = "ABCD";
        Random r = new Random();
        for (int i = 0; i < select.length; i++) {
            int index = r.nextInt(content.length());
            select[i] = content.charAt(index) + "";
        }
        System.out.println(Arrays.toString(select));
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : select) {
            if (hashMap.containsKey(s)) {
                Integer num = hashMap.get(s);
                hashMap.put(s,(Integer)num + 1);
            }else {
                hashMap.put(s, (Integer)1);
            }
        }

        System.out.println(hashMap);

        /*hashMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                if (hashMap.containsKey(s)) {
                    Integer num = hashMap.get(s);
                    hashMap.put(s,(Integer)num + 1);
                }else {
                    hashMap.put(s, (Integer)1);
                }
            }
        });
        hashMap.forEach((a,b)->{
            if (hashMap.containsKey(a)) {
                Integer num = hashMap.get(a);
                hashMap.put(a, num++);
            } else {
                hashMap.put(a, 1);
            }
        });*/

    }
}
