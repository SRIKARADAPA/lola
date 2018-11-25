package com.manideep.finaltracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class TrackActivity extends AppCompatActivity {

    ArrayList<String> getUsers(){
        ArrayList<String> users= new ArrayList<String>();
                users.add("manideep");

        return users;
    }


    Spinner spinner = (Spinner) findViewById(R.id.EmployeeSpinner);
    ArrayList<String> users = getUsers();

//    ArrayAdapter<String> adapter =
  //          new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, users);
    //    adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

      //  spinner.setAdapter(adapter);




//    ArrayAdapter<String> adapter = ArrayAdapter.createFromResource(this,
//            R.array.planets_array, android.R.layout.simple_spinner_item);
//
//    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//// Apply the adapter to the spinner
//spinner.setAdapter(adapter);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
    }
}
