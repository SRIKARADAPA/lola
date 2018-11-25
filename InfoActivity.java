package com.manideep.finaltracker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);



        Button butoon = (Button) findViewById(R.id.Continue);


//        final String userString =  "manideep";//username.getText().toString();
//        final String passwordString = "manideep";//password.getText().toString();


        final Intent i1 = new Intent(this, MapsActivity2.class);

        butoon.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v) {
                        startActivity(i1);
                    }
                }
        );
    }
}
