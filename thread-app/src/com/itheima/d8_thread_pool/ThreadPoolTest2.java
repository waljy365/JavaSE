package com.itheima.d8_thread_pool;

import java.util.concurrent.*;

/**
 * 目标：掌握线程池的创建。
 */
public class ThreadPoolTest2 {
    public static void main(String[] args) {
        // 1、通过ThreadPoolExecutor创建一个线程池对象。
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());
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
        //线程忙，队列满 主线程执行
        pool.execute(new MyRunnable());
    }
}
