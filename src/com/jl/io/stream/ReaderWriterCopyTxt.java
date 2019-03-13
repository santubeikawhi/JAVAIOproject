package com.jl.io.stream;

import java.io.*;

/**
 * @ClassName ReaderWriterCopyTxt
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/8 17:29
 * @Version 1.0
 */
public class ReaderWriterCopyTxt {
    public static void main(String[] args){
        File src = new File("D://aw.txt");
        File target = new File("D://bw.txt");
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(src);
            writer = new FileWriter(target);
            char[] buff = new char[8];
            int len;
            while((len = reader.read(buff))!=-1){
                writer.write(buff,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null){
                    reader.close();
                }
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
