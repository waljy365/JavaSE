package com.itheima.d2_xml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
  目标：如何使用程序把数据写出到 XML文件中去。
  <?xml version="1.0" encoding="UTF-8" ?>
  <book>
      <name>从入门到跑路</name>
      <author>tom</author>
      <price>999.9</price>
  </book>
 */
public class Dom4JTest2 {
    public static void main(String[] args) throws IOException {
        // 1、使用一个StringBuilder对象来拼接XML格式的数据。
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("<name>从入门到跑路</name>\r\n");
        sb.append("<author>tom</author>\r\n");
        sb.append("<price>999.9</price>\r\n");
        sb.append("</book>\r\n");
        //bufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("bb.xml"));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
