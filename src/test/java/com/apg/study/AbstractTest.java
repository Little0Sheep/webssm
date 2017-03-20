package com.apg.study;

/**
 * Created by apg on 2017/3/13.
 */

abstract class Telphone{
    public abstract void call();
    public abstract void message();
}

class CellPhone extends Telphone{

    public void call() {
        System.out.println("fuck");
    }

    public void message() {
        System.out.println("fuck2");
    }

}

public class AbstractTest {

    public static void main(String[] args){
        Telphone tel1=new CellPhone();
        tel1.call();
        tel1.message();
    }
}


