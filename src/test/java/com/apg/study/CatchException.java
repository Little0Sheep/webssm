package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */
public class CatchException {

    public void BugInfo(int a,int b){
        try{
            int c=a/b;
            System.out.println(c);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.toString());
        }finally{
            System.out.println("运算完成");
        }
    }

    static void pop() throws NegativeArraySizeException{
        int[] arr=new int[-3];
    }

    static void exp(double r) throws Exception{
        if(r<=0.0){
            throw new Exception("程序异常士大夫士大夫似的");
        }
    }

    public static void main(String[] args){
        CatchException ce=new CatchException();
        ce.BugInfo(4,2);

        try{
            pop();
        }catch(NegativeArraySizeException e){
            System.out.println("pop() 方法抛出异常");
        }

        try {
            exp(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
