package com.itheima.d2_upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * 目标：完成UDP通信快速入门：实现1发1收。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 创建DatagramSocket对象
        DatagramSocket client = new DatagramSocket();
        // 2.封装要发送的数据
        String str = "我是客户端。。。";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getByName(""),6666);
        client.send(datagramPacket);
        System.out.println("发送完毕");
        client.close();
    }
}
