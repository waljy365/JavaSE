package com.itheima.d5_tcp2;


import java.net.ServerSocket;
import java.net.Socket;

/*
   目标：完成TCP通信快速入门-服务端开发：实现1发1收。
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1、创建ServerSocket的对象，同时为服务端注册端口。
        ServerSocket server = new ServerSocket(6666);
        while (true) {
            // 2、使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = server.accept();
            // 3、从socket通信管道中得到一个字节输入流。
            // InputStream inputStream = socket.getInputStream();
            // 4、把原始的字节输入流包装成高效的输入流
            // DataInputStream dis = new DataInputStream(inputStream);
            // 5、使用数据输入流读取客户端发送过来的消息
            new ServerReaderThread(socket).start();
        }
        // System.out.println(socket.getRemoteSocketAddress());
        // System.out.println(socket.getPort());
        // 6、释放资源
    }
}













