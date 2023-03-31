package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

/**
 * 目标：掌握线程池的创建。
 */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        // 1、通过ThreadPoolExecutor创建一个线程池对象。
        // ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
        //         TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory()
        //         new ThreadPoolExecutor.CallerRunsPolicy());

        //核心线程数
        //最大线程数
        //存活时间
        //存活时间单位
        //工作队列
        //线程工场
        //拒绝策略
        ExecutorService pool = new ThreadPoolExecutor
                    (3, 5, 1000, TimeUnit.SECONDS,
                            new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                            new ThreadPoolExecutor.AbortPolicy());
        //进行复用
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        //核心线程忙，队列满创建临时线程
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        //线程忙，队列满 拒绝新任务
        pool.execute(new MyRunnable());


    }
}
