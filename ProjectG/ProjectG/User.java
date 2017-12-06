package com;

import java.util.ArrayList;

public class User  {
    public static ArrayList<User> userList = new ArrayList<>();
    String name;
    String password;
public User (String n, String p){
    name=n;
    password=p;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

}
