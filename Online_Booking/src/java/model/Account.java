/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class Account {
    private int userId;
    String userName, password, email, fname, lname, phone;
    boolean isAdmin, isBooker, isOwner;
    String picture;

    public Account() {
    }

    public Account(int userId, String userName, String password, String email, String fname, String lname, String phone, boolean isAdmin, boolean isBooker, boolean isOwner, String picture) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.isAdmin = isAdmin;
        this.isBooker = isBooker;
        this.isOwner = isOwner;
        this.picture = picture;
    }

    public int getUserId() {
        return userId;
    }

    public void setUseId(int useId) {
        this.userId = useId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isIsBooker() {
        return isBooker;
    }

    public void setIsBooker(boolean isBooker) {
        this.isBooker = isBooker;
    }

    public boolean isIsOwner() {
        return isOwner;
    }

    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
}
