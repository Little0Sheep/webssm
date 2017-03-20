package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */
public class CustomException extends Exception {

    public CustomException(String ErrorMessager){
        super(ErrorMessager);
        System.out.println("自定义异常类");
    }

}
