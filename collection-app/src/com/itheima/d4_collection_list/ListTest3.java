package com.itheima.d4_collection_list;

import java.util.LinkedList;

/**
 * 目标：掌握LinkedList集合的使用。
 *  LinkedList特有方法
 *      public void addFirst(E e)	在该列表开头插入指定的元素
 *      public void addLast(E e)	将指定的元素追加到此列表的末尾
 *      public E getFirst()	返回此列表中的第一个元素
 *      public E getLast()	返回此列表中的最后一个元素
 *      public E removeFirst()	从此列表中删除并返回第一个元素
 *      public E removeLast()	从此列表中删除并返回最后一个元素
 */
public class ListTest3 {
    public static void main(String[] args) {
        // 1、创建一个队列。
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("A");
        queue.addLast("B");
        queue.addLast("C");
        queue.addLast("D");
        queue.addLast("E");
        System.out.println(queue);
        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
        System.out.println("--------------------------------------------------");
        // 2、创建一个栈对象。
        LinkedList<String> stack = new LinkedList<>();
        // 压栈(push)
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
        stack.push("第五颗子弹");
        System.out.println(stack);
        // 出栈(pop)
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
