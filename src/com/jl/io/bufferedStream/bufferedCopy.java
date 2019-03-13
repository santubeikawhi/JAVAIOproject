package com.jl.io.bufferedStream;

import java.io.*;

/**
 * @ClassName bufferedCopy
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/13 9:13
 * @Version 1.0
 */
public class bufferedCopy {
    public static void main(String[] args){
        File source = new File("D://bufw.txt");
        File target = new File("D://bufc.txt");
        BufferedInputStream reader = null;
        BufferedOutputStream writor = null;
        if(source.exists()&&source.isFile()){
            try {
                reader = new BufferedInputStream(new FileInputStream(source));
                writor = new BufferedOutputStream(new FileOutputStream(target));
                byte[] bytes = new byte[8];
                int len = -1;
                while((len=reader.read(bytes))!= -1){
                    writor.write(bytes,0,len);
                }
                writor.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                    if(writor!=null){
                        writor.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
