
package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

/**
 * 目标：掌握线程池的创建。
 */
public class ThreadPoolTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1、通过ThreadPoolExecutor创建一个线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
        //任务是计算类型的，核心线程数=cpu+1
        //io类型的任务：核心线程=cpu*2
        Future<String> submit1 = pool.submit(new MyCallable(100));
        Future<String> submit2 = pool.submit(new MyCallable(200));
        Future<String> submit3 = pool.submit(new MyCallable(300));
        Future<String> submit4 = pool.submit(new MyCallable(400));
        System.out.println(submit1.get());
        System.out.println(submit2.get());
        System.out.println(submit3.get());
        System.out.println(submit4.get());
    }
}
