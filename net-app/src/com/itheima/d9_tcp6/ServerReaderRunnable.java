package com.itheima.d9_tcp6;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        //  立即响应一个网页内容：“黑马程序员”给浏览器展示。
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("HTTP/1.1 200 OK");
            bw.newLine();
            bw.write("Content-Type:text/html;charset=UTF-8");
            bw.newLine(); // 必须换行
            bw.write("<div style='color:red;font-size:120px;text-align:center'>黑马程序员666<div>");
            bw.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
