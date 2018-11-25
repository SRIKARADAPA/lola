package com.manideep.finaltracker;

import android.widget.EditText;

public class user {

    String username;
    String password;
    boolean status;
    int noFlags;

    user(){  }

    user(String name,String pass){
        username = name;
        password = pass;
        status = false;
        noFlags=0;
    }

    user(String name,String pass,boolean stat){
        username = name;
        password = pass;
        status = stat;
        noFlags=0;
    }

    String getUsername(){ return username;}
    String getPassword(){ return password;}
}
