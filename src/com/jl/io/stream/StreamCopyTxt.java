package com.jl.io.stream;

import java.io.*;

/**
 * @ClassName StreamCopyTxt
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/8 16:55
 * @Version 1.0
 */
public class StreamCopyTxt {
    public static void main(String[] args){
        File srcf = new File("D://a.txt");
        if(srcf.exists()&&srcf.isFile()){
            File target = new File("D://b.txt");
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                inputStream = new FileInputStream(srcf);
                outputStream = new FileOutputStream(target);
                int len;
                byte[] bytes = new byte[8];
                while((len = inputStream.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,len));
                    outputStream.write(bytes,0,len);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if(inputStream != null){
                        inputStream.close();
                    }
                    if(outputStream!=null){
                        outputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
