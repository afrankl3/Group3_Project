/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class Account {
    ArrayList<User> userList = new ArrayList<>();
    ArrayList<Admin> adminList = new ArrayList<>();
    
    
/** Remember to output the list into a file*/

public void signUp() {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Enter your account name");
    String username = input.next();
    System.out.println("Enter your password");
    String password = input.next();
    if (username.contains("mail.umw.edu")) {
        User newUser = new User(username, password);
        userList.add(newUser);
    } else if (username.contains("umw.edu")) {
        Admin newAdmin = new Admin(username, password);
        adminList.add(newAdmin);
    } else {
        System.out.println("Invalid UMW Login");
    }
}
public void deleteUserAccount(){
    return userList.remove();
}
public void deleteAdminAccount(){
    return adminList.remove();
}
}