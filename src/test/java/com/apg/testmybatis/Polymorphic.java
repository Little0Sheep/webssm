package com.apg.testmybatis;

/**
 * Created by apg on 2017/3/6.
 */
public class Polymorphic {

    private Polymorphic[] qtest=new Polymorphic[6];
    private int nextIndex=0;

    public void draw(Polymorphic q){
        if(nextIndex<qtest.length){
            qtest[nextIndex]=q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args){
        Polymorphic q=new Polymorphic();
        for(int i=0;i<8;i++) {
            q.draw(new Square());
            q.draw(new Parallelogramgle());
        }
    }

}

class Square extends Polymorphic{
    public Square(){
        System.out.println("正方形");
    }
}

class Parallelogramgle extends Polymorphic{
    public Parallelogramgle(){
        System.out.println("平行四边形");
    }
}
