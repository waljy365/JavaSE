package com.itheima.d5_resource;

/*
     目标：认识try-catch-finally。
 */
public class Test1 {
    public static void main(String[] args) {
        get();
    }

    private static void get() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[0]);
            // return arr[0];
            // System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //无论最后执行结果怎样，都会执行finally代码块
            //释放资源 垃圾处理
            System.out.println("我执行了");
        }
        // return -1;
    }
}
