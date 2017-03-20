package com.apg.study;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by apg on 2017/3/9.
 */
public class ComSortTest {

    public static void main(String[] args){
        List<User1> list=new ArrayList<User1>();
        list.add(new User1(3,"java","sdf"));
        list.add(new User1(2,"c++","haha"));
        list.add(new User1(1,"net","net"));
        System.out.println("排序前");
        for(User1 user:list){
            System.out.println(user);
        }
        System.out.println("排序后：");
        Collections.sort(list);
        for(User1 user:list){
            System.out.println(user);
        }

    }

}
