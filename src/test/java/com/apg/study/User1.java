package com.apg.study;

/**
 * Created by apg on 2017/3/9.
 */
public class User1 implements Comparable<User1>{
    private int id;
    private String userName;
    private String password;
    private int age;

    public User1(int id, String userName, String password){
        this.id=id;
        this.userName=userName;
        this.password=password;
    }

    public int compareTo(User1 user){
        if(id>user.id){
            return 1;
        }else if(id<user.id){
            return -1;
        }
        return 0;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("编号"+id+",");
        sb.append("姓名"+userName+",");
        sb.append("年龄"+age+",");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
