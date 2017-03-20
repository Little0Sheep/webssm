package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */
public class ThreadTest extends Thread{

    private String name;
    private int val;

    public ThreadTest(String name,int val){
        this.name=name;
        this.val=val;
    }

    public void run(){
        int count=0;
        while(true){
            try {
                this.sleep(val);
                count++;
                System.out.println(name+":"+count);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        };
    }

    public static void main(String[] args){
        ThreadTest t1=new ThreadTest("阿三",1000);
        ThreadTest t2=new ThreadTest("李四",1000);
        t1.setName("A");
        t2.setName("B");
        t1.setPriority(1);
        t2.setPriority(5);
        t1.start();
        t2.start();
        ;

//        ThreadRunTest t1=new ThreadRunTest("fuck1");
//        ThreadRunTest t2=new ThreadRunTest("fuck2");
//
//        Thread td1=new Thread(t1);
//        try {
//            td1.start();
//            td1.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(td1.getState());

    }

}

class ThreadRunTest implements Runnable{

    private String name;

    public ThreadRunTest(String name){
        this.name=name;
    }

    public void run(){
        while(true){
            System.out.println(name);
        }
    }
}
