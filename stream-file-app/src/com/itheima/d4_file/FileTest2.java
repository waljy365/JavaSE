package com.itheima.d4_file;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;

/**
     目标：掌握File提供的判断文件类型、获取文件信息功能
         public boolean exists()	判断当前文件对象，对应的文件路径是否存在，存在返回true
         public boolean isFile()	判断当前文件对象指代的是否是文件，是文件返回true，反之。
         public boolean isDirectory()	判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之。
         public String getName()	获取文件的名称（包含后缀）
         public long length()	获取文件的大小，返回字节个数
         public long lastModified()	获取文件的最后修改时间。
         public String getPath()	获取创建文件对象时，使用的路径
         public String getAbsolutePath()	获取绝对路径
 */
public class FileTest2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1.创建文件对象，指代某个文件
        File f = new File("a.txt");
        // 2、public boolean exists()：判断当前文件对象，对应的文件路径是否存在，存在返回true.
        System.out.println(f.exists());
        // 3、public boolean isFile() : 判断当前文件对象指代的是否是文件，是文件返回true，反之。
        System.out.println(f.isFile());
        // 4、public boolean isDirectory()  : 判断当前文件对象指代的是否是文件夹，是文件夹返回true，反之。
        System.out.println(f.isDirectory());
        // 5.public String getName()：获取文件的名称（包含后缀）
        System.out.println(f.getName());
        // 6.public long length()：获取文件的大小，返回字节个数
        System.out.println(f.length());
        // 7.public long lastModified()：获取文件的最后修改时间。 返回的是毫秒值,还需要转成Date
        System.out.println(f.lastModified());
        // 8.public String getPath()：获取创建文件对象时，使用的路径
        System.out.println(f.getPath());
        // 9.public String getAbsolutePath()：获取绝对路径
        System.out.println(f.getAbsolutePath());
    }
}
