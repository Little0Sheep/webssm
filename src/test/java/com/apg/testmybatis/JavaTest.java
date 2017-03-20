package com.apg.testmybatis;

import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;

/**
 * Created by apg on 2017/3/5.
 */

import java.util.*;

public class JavaTest {

    static final double PI=Math.PI;
    static int age=23;
    static char n='y';

    private char r(int year){
        if(year%4==0 && year%100!=0 || year%400==0){
            return 'y';
        }else{
            return 'n';
        }
    }

    private double volume(double r){
        double volume=4.0/3.0*PI*Math.pow(r,3);
        return volume;
    }

    private void printHollowRhombus(int size){
        if(size%2==0){
            size++;
        }
        for(int i=0;i<size/2+1;i++){
            for(int j=size/2+1;j>i+1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(j==0||j==2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=size/2+1;i<size;i++){
            for(int j=0;j<i-size/2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*size-1-2*i;j++){
                if(j==0||j==2*(size-i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private void yanghuiTriangle(){
        int triangle[][]=new int[8][];
        for(int i=0;i<triangle.length;i++){
            triangle[i]=new int[i+1];
            for(int j=0;j<=triangle[i].length-1;j++){
                if(i==0||j==0||j==triangle[i].length-1){
                    triangle[i][j]=1;
                }else{
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        JavaTest jt=new JavaTest();
//        int year = new Scanner(System.in).nextInt();
//        System.out.println(jt.r(year));

//        JavaTest jt=new JavaTest();
//        System.out.println("请输入球形的半径：");
//        double r=new Scanner(System.in).nextDouble();
//        System.out.println(jt.volume(r));

//        jt.printHollowRhombus(5);
//        jt.yanghuiTriangle();

/*        int mp[]={55,22,10,2,66};
        int a,b=0;
        for(int i=0;i<mp.length;i++){
            for(int j=i+1;j<mp.length;j++){
                if(mp[i]>mp[j]){
                    a=mp[i];
                    b=mp[j];
                    mp[j]=a;
                    mp[i]=b;
                }
            }
        }
        System.out.println(Arrays.toString(mp));*/

/*        String a="A",b="B",c="C",d="D",e="E";
        List<String> list=new LinkedList<String>();
        list.add(a);
        list.add(e);
        list.add(d);
        Iterator<String> fristIterator=list.iterator();
        System.out.println("修改前的元素为");
        while(fristIterator.hasNext()){
            System.out.print(fristIterator.next()+" ");
        }
        list.set(1,b);
        list.add(2,c);
        Iterator<String> it=list.iterator();
        System.out.println();
        System.out.println("修改后的元素为");
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }*/

/*        List<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("pear");
        list.add("banana");
        list.add("apple");
        Set<String> set=new HashSet<String>();
        set.addAll(list);
        Iterator<String> it=set.iterator();
        System.out.println("集合中的元素是");
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }*/

/*        Map<String,String> map=new HashMap<String,String>();
        map.put("1","apple");
        map.put("2","pear");
        map.put("3","orange");
        for(int i=1;i<=3;i++){
            System.out.println("第"+i+"元素是:"+map.get(String.valueOf(i)));
        }

        for(String str:map.values()){
            System.out.println(str);
        }
        Map<String,String> map1=new HashMap<String,String>();
        map.put("5","haha");
        map.putAll(map1);

        System.out.println(map.get("5"));*/

/*        Set<User> hashSet=new HashSet<User>();
        hashSet.add(new User("哇哈哈",201201));
        hashSet.add(new User("测试",2343243));
        Iterator<User> it=hashSet.iterator();
        while(it.hasNext()){
            User u=it.next();
            System.out.println(u.getUsername()+" "+u.getUserphone());
        }
        Map<Integer,Object> map=new HashMap<Integer,Object>();
        int count=0;
        for(User u:hashSet){
            map.put(count,u);
            count++;
        }
        for(Map.Entry<Integer,Object> entry:map.entrySet()){
            System.out.println(((User)entry.getValue()).getUsername());
            System.out.println(((User)entry.getValue()).getUserphone());
        }
        Set<Integer> set=map.keySet();
        Iterator<Integer> it1=set.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }*/

        String str[]={"一","二","三","四","五","六","七","八","九","十","二十","三十","四十","五十","六十","七十","八十","九十"};

        int num=5;
        if(num<10){
            System.out.println(str[num-1]);
        }else{
            System.out.println(str[Integer.parseInt(String.valueOf(num).substring(0,1))+8]+str[Integer.parseInt(String.valueOf(num).substring(1,2))-1]);
        }

        String word="i love  java     like  python";
        String words[]=word.split(" ");
        List list=new LinkedList();
        for(String s:words){
            if(s.length()>0) {
                list.add(s.trim());
            }
        }
        System.out.println(list);

        int hw=12345321;
        List l=new ArrayList();
        for(int i=0;i<String.valueOf(hw).length()/2;i++){
            if(String.valueOf(String.valueOf(hw).charAt(i)).equals(String.valueOf(String.valueOf(hw).charAt(String.valueOf(hw).length()-i-1)))){
                l.add("回文");
            }
        }
        if(String.valueOf(hw).length()/2==l.size()){
            System.out.println("回文");
        }else{
            System.out.println("不是回文");
        }








    }
}
