package com.jl.io.stream;

import java.io.*;

/**
 * @ClassName ReaderReadTxt
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/11 8:54
 * @Version 1.0
 */
public class ReaderReadTxt {
    public static void main(String[] args){
        Reader reader=null;
        File file = new File("D:/aw.txt");
        if(file.exists()&&file.isFile()){
            try {
                reader = new FileReader(file);
                char[] buff = new char[10];
                int len = -1;
                while((len = reader.read())!=-1){
                    System.out.print((char)len);
                }
                System.out.println("");
                reader = new FileReader(file);
                while((len = reader.read(buff))!=-1){
                    System.out.print(new String(buff,0,len));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(reader!=null){
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }else{
            System.out.println("文件未找到或不存在该文件");
        }
    }
}
