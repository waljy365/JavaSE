package com.itheima.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/*
     目标：掌握使用Dom4j框架解析XML文件。
 */
public class Dom4JTest1 {
    public static void main(String[] args) throws DocumentException {
        System.out.println(System.getProperty("user.dir"));
        //创建解析器对象
        SAXReader saxReader = new SAXReader();
        //加载xml文件 获取document对象
        Document document = saxReader.read("student.xml");
        //获取根元素
        Element rootElement = document.getRootElement();
        //获取根元素下的所有子元素
        List<Element> list = rootElement.elements();
        //遍历元素对象
        for (Element element : list) {
            Attribute id = element.attribute("id");
            System.out.println("id属性值："+id.getText());
            System.out.println("id属性值："+id.getValue());
            Element name = element.element("name");
            System.out.println("姓名："+name.getText());
            System.out.println("姓名："+name.getStringValue());
            Element age = element.element("age");
            System.out.println("年龄："+age.getText());
            Element info = element.element("info");
            System.out.println("信息："+info.getText());
        }

    }
}
