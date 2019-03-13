package com.jl.io.copyfile;

import java.io.*;
import java.util.Scanner;

/**
 * @ClassName CopySingleFile
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/7 9:57
 * @Version 1.0
 */
public class CopySingleFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入所要复制的文件路径");
        while(true){
            String dir = scanner.nextLine();
            File file =  new File(dir);
            if(file.exists()){
                if(file.isFile()){
                    System.out.println("已找到改文件");
                    scanner = new Scanner(System.in);
                    System.out.println("请输入复制到哪个文件夹");
                    while(true){
                        String dest = scanner.nextLine();
                        File destDir =  new File(dest);
                        if(!destDir.exists()){
                            System.out.println("创建目标文件");
                            destDir.mkdir();
                        }
                        BufferedInputStream inputStream = null;
                        BufferedOutputStream outputStream = null;
                        try {
                            //使用缓冲流
                            inputStream = new BufferedInputStream(new FileInputStream(file));
                            outputStream = new BufferedOutputStream(new FileOutputStream(new File(dest,file.getName())));
                            byte[] bytes = new byte[1024];
                            int len = 0;
                            while((len=inputStream.read(bytes))!=-1){
                                outputStream.write(bytes,0,len);
                            }
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }finally {
                            try {
                                outputStream.close();
                                inputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                    break;
                }else{
                    System.out.println("您输入的是文件夹，不是文件，请重新输入...");
                }
            }else{
                System.out.println("请输入正确的文件路径...");
            }
        }
    }
}
