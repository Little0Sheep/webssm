package com.apg.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by apg on 2017/3/9.
 */
public class SqlException {
    public static void main(String[] args){
        String URL="jdbc:mysql://apg-ubuntu:3306/apg";
        String DRIVER="com.mysql.jdbc.Driver";
        String USERNAME="root";
        Connection connection=null;
        try{
            Class.forName(DRIVER);
            connection=DriverManager.getConnection(URL,USERNAME,"666520");

            System.out.println("数据库连接成功");
        }catch(SQLException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }finally{
            try{
                connection.close();
                System.out.println("数据库已关闭连接");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        String s=String.valueOf(20);
        System.out.println("sdfds"+s);
    }
}
