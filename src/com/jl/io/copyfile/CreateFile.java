package com.jl.io.copyfile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


/**
 * @ClassName CreateFile
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/7 9:54
 * @Version 1.0
 */
public class CreateFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入所要创建的文件及路径");
        String dir = scanner.nextLine();
        File file = new File(dir);
        try {
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("创建出错"+e.getMessage());
        }
    }

}
