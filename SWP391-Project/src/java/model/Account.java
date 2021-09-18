/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MY LAPTOP
 */
public class Account {
    private int id;
    private String userName;
    private String passWord;
    private String email;
    private String fName;
    private String lName;
    private String phone;
    private boolean isAdmin;
    private boolean isBooker;
    private boolean isOwner;
    private String picture;

    public Account() {
    }

    public Account(int id, String userName, String passWord, String email, String fName, String lName, String phone, boolean isAdmin, boolean isBooker, boolean isOwner, String picture) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.isAdmin = isAdmin;
        this.isBooker = isBooker;
        this.isOwner = isOwner;
        this.picture = picture;
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email + ", fName=" + fName + ", lName=" + lName + ", phone=" + phone + ", isAdmin=" + isAdmin + ", isBooker=" + isBooker + ", isOwner=" + isOwner + ", picture=" + picture + '}';
    }
    
    
}