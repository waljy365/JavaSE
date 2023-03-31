package com.itheima.d1_junit;

import org.junit.*;

import java.io.IOException;

/**
 * @author : 王希辰
 * @date : 2023/3/16 9:31
 */
public class Test1 {

    // public static Socket socket=null;
    @Before
    public void testBefore() {
        // socket = new Socket();
        System.out.println("before");
    }
    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("beforeClass");
    }
    @AfterClass
    public static void testAfterClass() throws IOException {
        System.out.println("afterClass");
        // socket.close();
    }
    @After
    public void testAfter() {
        System.out.println("after");
    }
    @Test
    public void testPrintMumber() throws IOException {
        // System.out.println(socket.getOutputStream());
        StringUtil.printNumber("admin");
    }
    @Test
    public void testGetMaxNumber() {
        System.out.println(StringUtil.getMaxIndex("aada"));
        // 断言
        Assert.assertEquals("有问题",3,StringUtil.getMaxIndex("aada"));
    }
}
