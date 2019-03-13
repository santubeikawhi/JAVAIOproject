package com.jl.io.file;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @ClassName UserFile
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/7 9:55
 * @Version 1.0
 */
public class UserFile {
    //File类是 文件和目录路径名的抽象表示 File只能操作文件的属性，不能修改文件的内容
    public static void main(String[] args){
        File file = new File("D://test.txt");
        System.out.println(File.pathSeparator);//分隔多个路径字符串的分隔符
        System.out.println(File.separator);//分隔同一个路径字符串的目录
    }

    private static void TestConstructor(){
        File parentFile = new File("D://");

        File filepc = new File(parentFile,"test.txt");//从（父抽象路径名）和 （子路径名字符串）创建File实例

        File filepath = new File("D://test.txt");//从给定的（路径名字符串）转换为抽象路径名来创建File实例

        try {
            URI uri = new URI("D://test.txt");
            File fileURI = new File(uri);//通过给定file的URI转换抽象路径来创建File实例
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
