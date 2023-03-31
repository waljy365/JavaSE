package com.itheima.d5_map;

import java.util.HashMap;

/*
     目标：掌握Map集合的常用方法(重点)
        public V put(K key,V value)	添加元素
        public int size()	获取集合的大小
        public void clear()	清空集合
        public boolean isEmpty()	判断集合是否为空，为空返回true , 反之
        public V get(Object key)	根据键获取对应值
        public V remove(Object key)	根据键删除整个元素
        public  boolean containsKey(Object key)	判断是否包含某个键
        public boolean containsValue(Object value)	判断是否包含某个值
        public Set<K> keySet()	获取全部键的集合
        public Collection<V> values()	获取Map集合的全部值
 */
public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // public V put(K key,V value)	添加元素 更新元素
        hashMap.put("12", "21");
        hashMap.put("34", "43");
        hashMap.put("56", "65");
        hashMap.put("78", "87");
        // hashMap.put("78", "100");

        // public int size()	获取集合的大小
        System.out.println(hashMap.size());


        // public void clear()	清空集合
        // hashMap.clear();

        // public boolean isEmpty()	判断集合是否为空，为空返回true , 反之
        System.out.println(hashMap.isEmpty());

        // public V get(Object key)	根据键获取对应值
        System.out.println(hashMap.get("34"));

        // public V remove(Object key)	根据键删除整个元素
        // System.out.println(hashMap.remove("34"));

        // public  boolean containsKey(Object key)	判断是否包含某个键
        System.out.println(hashMap.containsKey("34"));


        // public boolean containsValue(Object value)	判断是否包含某个值
        System.out.println(hashMap.containsValue("43"));


        // public Set<K> keySet()	获取全部键的集合
        System.out.println(hashMap.keySet());

        // public Collection<V> values()	获取Map集合的全部值
        System.out.println(hashMap.values());

        System.out.println(hashMap);
    }
}
