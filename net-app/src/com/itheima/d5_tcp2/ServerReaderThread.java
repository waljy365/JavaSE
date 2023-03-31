package com.itheima.d5_tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author : 王希辰
 * @date : 2023/3/14 16:30
 */
public class ServerReaderThread extends Thread {

    private Socket socket;
    public ServerReaderThread(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        try {
            inputStream = socket.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4、把原始的字节输入流包装成高效的输入流
        DataInputStream dis = new DataInputStream(inputStream);
        // 5、使用数据输入流读取客户端发送过来的消息
        while (true) {
            String s = null;
            try {
                s = dis.readUTF();
            } catch (IOException e) {
                System.out.println(socket.getRemoteSocketAddress()+"下线了");
                try {
                    dis.close();
                    socket.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            }
            System.out.println(s);
        }
    }
}
