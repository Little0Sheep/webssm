package com.apg.study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by apg on 2017/3/9.
 */
public class FileStreamaa {
    public static void main(String[] args){
        File file=new File("d:/word.txt");
        try{
            FileOutputStream out=new FileOutputStream(file);
            byte buy[]="我有一只小毛驴，从来也不骑".getBytes();
            out.write(buy);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            FileInputStream in=new FileInputStream(file);
            byte byt[]=new byte[1024];
            int len=in.read(byt);
            System.out.println(new String(byt,0,len));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
