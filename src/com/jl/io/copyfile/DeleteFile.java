package com.jl.io.copyfile;

import java.io.File;
import java.util.Scanner;

/**
 * @ClassName DeleteFile
 * @Description TODO
 * @Author jiangl
 * @Date 2019/2/28 14:43
 * @Version 1.0
 */
public class DeleteFile {
    public static void main(String[] args){
        System.out.println("请输入所要删除的文件目录");
        Scanner scanner = new Scanner(System.in);
        String dir = scanner.nextLine();
        File file = new File(dir);
        if(file.isFile()){
            if(file.getParentFile().exists()){
                file.delete();
                System.out.println("删除成功");
            }
        }else{
            System.out.println("输入的路径不是文件");
        }
    }
}
