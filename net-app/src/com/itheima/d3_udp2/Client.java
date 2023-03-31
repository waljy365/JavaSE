package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 目标：完成UDP通信快速入门：实现1发1收。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1. 创建DatagramSocket对象
        DatagramSocket client = new DatagramSocket(7777);
        // 2.封装要发送的数据
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入需要发送的数据：");
            String str = sc.nextLine();
            if ("exit".equals(str)) {
                client.close();
                break;
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName(""), 6666);
            client.send(datagramPacket);
            System.out.println("发送完毕");
        }
    }
}
