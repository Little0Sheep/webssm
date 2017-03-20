package com.apg.study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by apg on 2017/3/9.
 */
public class DataStream {

    public static void main(String[] args){
        try{
            FileOutputStream fs=new FileOutputStream("d:/word.txt");
            DataOutputStream ds=new DataOutputStream(fs);
            ds.writeUTF("使用writeUTF()方法写入数据");
            ds.writeChars("使用writeChars()方法写入数据");
            ds.writeBytes("使用writeBytes()方法写入数据");
            ds.close();
            FileInputStream fis=new FileInputStream("d:/word.txt");
            DataInputStream dis=new DataInputStream(fis);
            System.out.println(dis.readUTF());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
