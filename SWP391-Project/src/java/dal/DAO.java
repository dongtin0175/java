/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;

/**
 *
 * @author MY LAPTOP
 */
public class DAO extends DBContext{
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String sql ="select * from Account";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Account(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getBoolean(8),
                            rs.getBoolean(9),
                            rs.getBoolean(10),
                            rs.getString(11)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
    public List<Account> searchAccountByLname(String txtSearch) {
        List<Account> list = new ArrayList<>();
        String sql ="select * from Account \n" +
                    "where [LName] like ? ";
            try {
                PreparedStatement st = connection.prepareStatement(sql);
                st.setString(1,"%" + txtSearch + "%");
                ResultSet rs = st.executeQuery();
                while(rs.next()){
                    list.add(new Account(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getBoolean(8),
                            rs.getBoolean(9),
                            rs.getBoolean(10),
                            rs.getString(11)));
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        return list;
        }
    public Account login(String Username,String Password){
        String sql ="select * from Account \n" +
                    "  where [UserName] = ?\n" +
                    "  and [PassWord] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, Username);
            st.setString(2, Password);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getBoolean(8),
                            rs.getBoolean(9),
                            rs.getBoolean(10),
                            rs.getString(11));
            }    
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
        public Account checkAccount(String Username,String Phone){
        String sql ="select * from Account\n" +
                    "  where [UserName] = ?\n" +
                    "  or [Phone] = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, Username);
            st.setString(2, Phone);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getBoolean(8),
                            rs.getBoolean(9),
                            rs.getBoolean(10),
                            rs.getString(11));
            }    
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void signup(String UserName,String PassWord,String Email,String FName,String LName,String Phone){
        String sql ="insert into Account\n" +
                    "  values (?,?,?,?,?,?,0,1,0,null)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,UserName);
            st.setString(2,PassWord);
            st.setString(3,Email);
            st.setString(4,FName);
            st.setString(5,LName);
            st.setString(6,Phone);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Account> list = dao.getAllAccount();
        for (Account account : list) {
            System.out.println(account);
        }
    }
}
