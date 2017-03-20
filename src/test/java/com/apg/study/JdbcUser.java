package com.apg.study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by apg on 2017/3/9.
 */
public class JdbcUser {

    public int addUser(User u){
        int i=0;
        DbTools db=new DbTools();
        Connection conn=db.getConn();
        try{
            String sql="insert into user_t(id,user_name,password,age) values(?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,u.getId());
            ps.setString(2,u.getUserName());
            ps.setString(3,u.getPassword());
            ps.setInt(4,u.getAge());
            i=ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public int updateUser(User u){
        int i=0;
        DbTools db=new DbTools();
        Connection conn=db.getConn();
        try{
            String sql="update user_t set user_name=?,password=?,age=? where id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,u.getUserName());
            ps.setString(2,u.getPassword());
            ps.setInt(3,u.getAge());
            ps.setInt(4,u.getId());
            i=ps.executeUpdate();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public List selectAll(){
        String sql="select * from user_t";
        DbTools db=new DbTools();
        Connection conn=db.getConn();
        ResultSet rs=null;
        List<User> list=new ArrayList<User>();
        try{
            Statement st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                User u=new User();
                u.setId(rs.getInt("id"));
                u.setUserName(rs.getString("user_name"));
                u.setPassword(rs.getString("password"));
                u.setAge(rs.getInt("age"));
                list.add(u);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public int delUser(User u){
        int i=0;
        DbTools db=new DbTools();
        Connection conn=db.getConn();
        try{
            String sql="delete from user_t where id=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,u.getId());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    public static void main(String[] args){
        JdbcUser ju=new JdbcUser();
//        User u=new User();
//        u.setId(2);
//        u.setUserName("apg");
//        u.setPassword("33245");
//        u.setAge(23);
//        ju.addUser(u);
//        ju.updateUser(u);

//        for(Object user:ju.selectAll()){
//            System.out.println(((User)user).getUserName());
//            System.out.println(((User)user).getAge());
//        }
        User u=new User();
        u.setId(1);
        ju.delUser(u);

    }

}
