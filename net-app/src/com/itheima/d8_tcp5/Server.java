package com.itheima.d8_tcp5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
   目标：完成TCP通信快速入门-服务端开发：要求实现与多个客户端同时通信。
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("-----服务端启动成功-------");
        // 1、创建ServerSocket的对象，同时为服务端注册端口。
        ServerSocket serverSocket = new ServerSocket(8080);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(24, 30,
                1, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(20),
                new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            // 2、使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"访问");
            // 3、把这个客户端对应的socket通信管道，交给一个独立的线程负责处理。
            // new ServerReaderThread(socket).start();
            pool.execute(new ServerReaderThread(socket));
        }
    }
}













