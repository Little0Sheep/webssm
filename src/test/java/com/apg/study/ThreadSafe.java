package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */
public class ThreadSafe implements Runnable{
    int num=10;
    public synchronized void run(){
        while(true){
                if(num>0){
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();;
                    }
                    System.out.println("tickets"+ --num);
                }else{
                    break;
                }
        }
    }

    public static void main(String[] args){
        ThreadSafe ts=new ThreadSafe();
        Thread[] threads=new Thread[5];
        for(int i=0;i<threads.length;i++){
            threads[i]=new Thread(ts);
            threads[i].start();
        }
    }
}
