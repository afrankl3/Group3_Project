package com;

import java.util.ArrayList;



public class Admin extends User{
    boolean isAdmin = false;
    public static ArrayList<Admin> adminList = new ArrayList<>();
public Admin (String n, String p){
   super(n,p);
   
}

public String getName(){
    return name;
}



}
