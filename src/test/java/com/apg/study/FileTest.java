package com.apg.study;

import java.io.File;
/**
 * Created by apg on 2017/3/9.
 */
public class FileTest {

    public static void main(String[] args){
        File file=new File("d:/word.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已经删除");
        }else{
            try{
                file.createNewFile();
                System.out.println("文件已经创建");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
