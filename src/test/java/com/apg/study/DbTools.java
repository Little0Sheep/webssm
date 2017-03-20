package com.apg.study;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by apg on 2017/3/9.
 */
public class DbTools {

    public Connection getConn(){
        String URL="jdbc:mysql://apg-ubuntu:3306/apg";
        String DRIVER="com.mysql.jdbc.Driver";
        String USERNAME="root";
        String PASSWORD="666520";

        Connection connection=null;
        try {
            Class.forName(DRIVER);
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;

    }

}
