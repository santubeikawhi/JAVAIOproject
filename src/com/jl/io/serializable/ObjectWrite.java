package com.jl.io.serializable;

import java.io.*;

/**
 * @ClassName ObjectWrite
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/3/13 11:00
 * @Version 1.0
 */
public class ObjectWrite {
    public static void main(String[] args){
        File file = new File("D://seriw.txt");
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            Person p = new Person("测试","男");
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(p);
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            byte[] bytes = new byte[10];
            Person rp = (Person)objectInputStream.readObject();
            System.out.println(rp.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(objectOutputStream!=null){
                    objectOutputStream.close();
                }
                if(objectInputStream!=null){
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
