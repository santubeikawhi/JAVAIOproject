package com.jl.io.bufferedStream;

import java.io.*;

/**
 * @ClassName bufferedRead
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/12 17:29
 * @Version 1.0
 */
public class bufferedRead {
    public static void main(String[] args){
        File file = new File("D://bufw.txt");
        BufferedInputStream bufferedInputStream = null;
        if(file.exists()){
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                int len = -1;
                byte[] bytes = new byte[8];
                while((len=bufferedInputStream.read(bytes))!=-1){
                    System.out.print(new String(bytes,0,len));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(bufferedInputStream != null){
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
