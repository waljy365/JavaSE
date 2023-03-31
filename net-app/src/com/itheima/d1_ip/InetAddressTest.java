package com.itheima.d1_ip;

import java.net.InetAddress;

/**
 * 目标：掌握InetAddress类的使用。
 *         public static InetAddress getLocalHost()	获取本机IP，会以一个inetAddress的对象返回
 *         public static InetAddress getByName(String host)	根据ip地址或者域名，返回一个inetAdress对象
 *         public String getHostName()	获取该ip地址对象对应的主机名。
 *         public String getHostAddress()	获取该ip地址对象中的ip地址信息。
 *         public boolean isReachable(int timeout)	在指定毫秒内，判断主机与该ip对应的主机是否能连通
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        //getLocalHost()	获取本机IP
        InetAddress localHost = InetAddress.getLocalHost();
        //getHostName()	获取该ip地址对象对应的主机名。
        System.out.println(localHost.getHostName());
        // getHostAddress()	获取该ip地址对象中的ip地址信息。
        System.out.println(localHost.getHostAddress());

        InetAddress byName = InetAddress.getByName("LAPTOP-C2GD72DB");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());

        System.out.println(byName.isReachable(6000));
    }
}
