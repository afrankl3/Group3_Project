package com.admin;

import com.user.User;

public class Admin extends User{
    boolean isAdmin = false;

    public boolean areAmin() {
        if (getUserName().contains("@umw.edu")) {
            return isAdmin = true;
        } else {
            return isAdmin = false;
        }
    }
}
