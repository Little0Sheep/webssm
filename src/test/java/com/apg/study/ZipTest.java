package com.apg.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by apg on 2017/3/9.
 */
public class ZipTest {

    private void zip(String zipFileName,File inputFile) throws Exception{
        ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));
        zip(out,inputFile,"");
        System.out.println("压缩中..");
        out.close();
    }
    private void zip(ZipOutputStream out,File f,String base) throws Exception{
        if(f.isDirectory()){
            File[] f1=f.listFiles();
            out.putNextEntry(new ZipEntry(base+"/"));
            base=base.length()==0?"":base+"/";
            for(int i=0;i<f1.length;i++){
                zip(out,f1[i],base+f1[i]);
            }
        }else{
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in=new FileInputStream(f);
            int b;
            System.out.println(base);
            while((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
        }
    }

    private void openZip(FileInputStream fis){
        ZipInputStream zin;
        try{
            zin=new ZipInputStream(fis);
            ZipEntry entry=zin.getNextEntry();
            while((entry=zin.getNextEntry())!=null && !entry.isDirectory()){
                File file=new File(entry.getName());
                System.out.println(file);
                if(!file.exists()){
//                    file.mkdirs();
                    file.createNewFile();
                }
                zin.closeEntry();
                System.out.println(entry.getName()+"解压成功");
            }
            zin.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        ZipTest zt=new ZipTest();
//        try{
//            zt.zip("D:/testzip.zip",new File("D:/testzip/"));
//            System.out.println("压缩完成");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        try {
            zt.openZip(new FileInputStream("d:/testzip.zip"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
