package com.itheima.d5_recursion;

import java.io.File;

/*
    目标：掌握文件删除
 */
public class RecursionTest3 {
    public static void main(String[] args) {

    }

    public static void deleteDir(File dir) {
        // 1.删除自己文件夹下的所有文件
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                deleteDir(file);//大问题 分解成 小问题
            } else {
                file.delete();//文件 直接删除
            }
        }
        // 2.删除自己
        dir.delete();
    }
}









