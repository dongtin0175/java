/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author ADMIN
 */
public class DAO extends DBContext{
    public Account getByID(int id){
        String sql="select * from Account where userId=?";
        try{
            PreparedStatement st= connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs= st.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt("userId"), rs.getString("UserName"), 
                        rs.getString("PassWord"), rs.getString("Email"), rs.getString("FName"), 
                        rs.getString("LName"), rs.getString("Phone"), rs.getBoolean("isAdmin"), 
                        rs.getBoolean("isBooker"), rs.getBoolean("isOwner"), rs.getString("Picture"));
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    public int updateAccount(int id,String uname, String fname, String lname, String phone, String role){
        boolean isAdmin= false, isBooker= false, isOwner=false;
            if(role.equalsIgnoreCase("Admin")) isAdmin = true;
            if(role.equalsIgnoreCase("Booker")) isBooker = true;
            if(role.equalsIgnoreCase("Owner")) isOwner = true;
            String sql="Update Account set UserName=?, FName=?, LName=?, Phone=?, isAdmin=?, "
                    + "isBooker=?, isOwner=? where userId=?";
            try{
                PreparedStatement st= connection.prepareStatement(sql);
                st.setString(1, uname);
                st.setString(2,fname);
                st.setString(3,lname);
                st.setString(4,phone);
                st.setBoolean(5, isAdmin);
                st.setBoolean(6, isBooker);
                st.setBoolean(7, isOwner);
                st.setInt(8, id);
                return st.executeUpdate();
            }catch(SQLException ex){
                System.out.println(ex);
            }
        return 0;
    }
    public int editAdmin(int id,String uname, String pass, String fname, String lname, String phone, String role){
        boolean isAdmin= false, isBooker= false, isOwner=false;
            if(role.equalsIgnoreCase("Admin")) isAdmin = true;
            if(role.equalsIgnoreCase("Booker")) isBooker = true;
            if(role.equalsIgnoreCase("Owner")) isOwner = true;
            String sql="Update Account set UserName=?, PassWord=?, FName=?, LName=?, Phone=?, isAdmin=?, "
                    + "isBooker=?, isOwner=? where userId=?";
            try{
                PreparedStatement st= connection.prepareStatement(sql);
                st.setString(1, uname);
                st.setString(2, pass);
                st.setString(3,fname);
                st.setString(4,lname);
                st.setString(5,phone);
                st.setBoolean(6, isAdmin);
                st.setBoolean(7, isBooker);
                st.setBoolean(8, isOwner);
                st.setInt(9, id);
                return st.executeUpdate();
            }catch(SQLException ex){
                System.out.println(ex);
            }
        return 0;
    }
    public static void main(String[] args){
        DAO db= new DAO();
        System.out.println(db.getByID(1).getFname());
    }
}
