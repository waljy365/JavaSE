package com.itheima.d8_tcp5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread implements Runnable {
// public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //  立即响应一个网页内容：“黑马程序员”给浏览器展示。
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream printStream = new PrintStream(os);
            printStream.println("HTTP/1.1 200 OK");
            printStream.println("Content-Type:text/html;charset=utf-8");
            printStream.println();
            printStream.println("we are family");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
