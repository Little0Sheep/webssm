package com.apg.testmybatis;

/**
 * Created by apg on 2017/3/5.
 */
public class User {

    private String username;
    private int userphone;

    public User(String username,int userphone){
        this.username=username;
        this.userphone=userphone;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserphone() {
        return userphone;
    }

    public void setUserphone(int userphone) {
        this.userphone = userphone;
    }
}
