package com.itheima.d2_upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 目标：完成UDP通信快速入门-服务端开发
 */
public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建服务对象
        DatagramSocket server = new DatagramSocket(6666);
        byte[] bytes = new byte[64*1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        //接收数据
        server.receive(datagramPacket);
        int length = datagramPacket.getLength();//获取数据长度
        // System.out.println(new String(bytes,0,length));
        String s = new String(bytes);
        System.out.println(s.trim());
        //释放资源
        server.close();
    }
}
