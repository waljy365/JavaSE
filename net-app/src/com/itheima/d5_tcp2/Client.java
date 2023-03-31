package com.itheima.d5_tcp2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
   目标：完成TCP通信快速入门-客户端开发：实现1发1收。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1、创建Socket对象，并同时请求与服务端程序的连接。
        Socket client = new Socket("127.0.0.1", 6666);
        // 2、从socket通信管道中得到一个字节输出流，用来发数据给服务端程序。
        OutputStream outputStream = client.getOutputStream();
        // 3、把低级的字节输出流包装成高效的输出流
        DataOutputStream dos=new DataOutputStream(outputStream);
        // 4、开始写数据出去了
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if ("exit".equals(s)) {
                dos.close();
                client.close();
                break;
            }
            dos.writeUTF(s);
        }
        // 5、释放连接资源
    }
}
