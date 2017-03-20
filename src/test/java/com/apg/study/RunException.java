package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */
public class RunException {
    static int i[]={2,3,45,56,60};
    static int getNum(int index) throws CustomException{
        if(index>i.length) {
            throw new CustomException("下标超载了");
        }
        return i[index];
    }

    public static void main(String[] args){
        try {
            System.out.println(getNum(20));
        }catch(CustomException e){
            System.out.println(e);
        }
    }

}
