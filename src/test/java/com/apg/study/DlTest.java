package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */

public class DlTest{

    public static void main(String[] args){
        DlTest1 dl=DlTest1.getInstance("sdfds");
        dl.getName();
        DlTest1 dl2=DlTest1.getInstance("erewr");
        dl2.getName();
    }
}

class DlTest1 {
    private static DlTest1 dl=null;
    private static String name;
    private static int i;
    static int t;

    private DlTest1(String name){
        this.name=name;
    }

    public static DlTest1 getInstance(String name){
        if(dl==null){
            dl=new DlTest1(name);
        }
        return dl;
    }

    public void getName() {
        System.out.println(name + "所说的奋斗" + i--);
    }

}
