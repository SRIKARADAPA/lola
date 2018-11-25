package com.manideep.finaltracker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    boolean check(String username ){ return true; }
    void appenduser(String username , String password , boolean status){
    }


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        final EditText username = findViewById(R.id.username);
        final EditText password=  findViewById(R.id.password);
        final RadioGroup group =  findViewById(R.id.radioGroup);
        final RadioButton adminRadio = findViewById(R.id.radioAdmin);
        RadioButton userRadio  = findViewById(R.id.radioUser);

        adminRadio.setId(1);
        userRadio.setId(0);

        final String userString = username.getText().toString();
        final String passString = password.getText().toString();

        final Intent add = new Intent( this , MainActivity.class );

        Button addButton = findViewById(R.id.AddButton);


        addButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        int selectedId = group .getCheckedRadioButtonId();


                        boolean status=false;

                        if(selectedId==1){status = true; }



                        if( check( userString ) ){
                            appenduser(userString , passString , status);
                            startActivity(add);
                        }
                        else {
                            username.setText("");
                            password.setText("");
                            Context context = getApplicationContext();
                            CharSequence text = "Username Exists";
                            int duration = Toast.LENGTH_SHORT;

                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                        }

                    }
                }

        );

    }
}