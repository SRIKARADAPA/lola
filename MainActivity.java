package com.manideep.finaltracker;
import java.util.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    user srikar = new user("srikar","srikar",false);
    user baswanth = new user("baswanth","baswanth",false);
    user pappu = new user("pappu","pappu",false);
    user manideep = new user("manideep","manideep",true);
    user admin = new user("admin","admin",true);

    ArrayList<user> userInfo = new ArrayList<user>( Arrays.asList( srikar,baswanth,pappu,manideep,admin) );


    int check(String username, String password) {
        for(int i=0;i<5;i++){
            if(userInfo.get(i).getUsername().equals(username) && userInfo.get(i).getPassword().equals(password)){
                if(userInfo.get(i).status ){
                    return 0;
                }
                else {
                    return 1;
                }
            }
            else if(userInfo.get(i).username.equals(username)){
                return 2;
            }
        }
        return 3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText username =  (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);
        Button Signin = (Button) findViewById(R.id.login);

        final String userString =  username.toString();
        final String passwordString = password.getText().toString();

//        final String userString =  "manideep";//username.getText().toString();
//        final String passwordString = "manideep";//password.getText().toString();


        final Intent user  = new Intent( this , UserHome.class );
        final Intent admin = new Intent( this ,AdminHome.class );
        final Intent maps  = new Intent( this, MapsActivity2.class);


        Signin.setOnClickListener(

                new Button.OnClickListener() {

                    @SuppressLint("SetTextI18n")
                    public void onClick(View v) {



                        user.putExtra("username" , userString );
                        //user.putExtra("password" , passwordString);

                        admin.putExtra("username" , userString );
                        //admin.putExtra("password" , passwordString);


                        if( check( userString , passwordString ) == 1){
                            startActivity(user);
                        }
                        else if ( check( userString , passwordString ) ==3 ){
                            startActivity(admin);
                            //startActivity( maps);
                        }
                        else {
                            username.setText(userString + " gap " + passwordString);
                            password.setText("");
                            Context context = getApplicationContext();
                            CharSequence text = "Invalid Credentials";
                            int duration = Toast.LENGTH_SHORT;

                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                        }
                    }
                }

        );
    }
}
