package com.jl.io.stream;

import java.io.*;

/**
 * @ClassName StreamWriteTxt
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/8 15:51
 * @Version 1.0
 */
public class StreamWriteTxt {
    public static void main(String[] args){
        OutputStream outputStreamWriter = null;
        File target = null;
        try {
            target = new File("D://a.txt");
            outputStreamWriter = new FileOutputStream(target);
            outputStreamWriter.write(65);
            outputStreamWriter.write("Aa".getBytes());
            outputStreamWriter.write("ABCDEFG".getBytes(),0,2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStreamWriter!=null){
                try {
                    outputStreamWriter.close();
                    System.out.println(target.getParentFile());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
