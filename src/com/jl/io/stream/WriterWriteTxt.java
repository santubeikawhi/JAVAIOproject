package com.jl.io.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName WriterWriteTxt
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/8 17:09
 * @Version 1.0
 */
public class WriterWriteTxt {
    public static void main(String[] args){
        File target = new File("D://aw.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter(target);
            writer.write(65);
            writer.write("中文");
            writer.write("测试".toCharArray());
            writer.write("长度玩大声道",1,4);
            writer.write("是打发士大夫".toCharArray(),2,4);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
