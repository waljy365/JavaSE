package com.itheima.homework;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * @author : 王希辰
 * @date : 2023/3/11 21:09
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, DocumentException {
        // write();
        // read();
        // write1();
        read1();
    }
    public static void write() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("brand", "Iphone11Pro Max");
        pro.setProperty("capacity", "256G");
        pro.setProperty("price", "10899");
        pro.store(new FileWriter("iphone.properties"),"iphone");
    }
    public static void read() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("iphone.properties"));
        Set<String> set = prop.stringPropertyNames();
        set.forEach((s -> {
            System.out.println(s+"--"+prop.getProperty(s));
        }));
    }
    public static void write1() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<book><书名>《架构师成长之路》</书名><出版社>黑马程序员</出版社><出版日期>2010-6-6</出版日期><价格>125.00</价格></book>\n" +
                "<book><书名>《JavaEE企业级开发》</书名><出版社>黑马研究院</出版社><出版日期>2011-5-5</出版日期><价格>115.80</价格></book>\n" +
                "<book><书名>《Oracle指南》</书名><出版社>清华计算机</出版社><出版日期>2012-7-7</出版日期><价格>89.00</价格></book>");
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.xml"));
        bw.write(sb.toString());
        bw.close();
    }
    public static void read1() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("a.xml");
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println(element.element("书名").getText());
            System.out.println(element.element("出版社").getText());
            System.out.println(element.element("出版日期").getText());
            System.out.println(element.element("价格").getText());
        }
    }
}
