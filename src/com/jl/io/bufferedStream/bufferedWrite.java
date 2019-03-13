package com.jl.io.bufferedStream;

import java.io.*;

/**
 * @ClassName bufferedWrite
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/12 17:13
 * @Version 1.0
 */
public class bufferedWrite {
    public static void main(String[] args){
        BufferedOutputStream bos=null;
        File file = new File("D://bufw.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            bos = new BufferedOutputStream(new FileOutputStream(file));
            bos.write(56);

            bos.write("测试".getBytes());
            bos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
