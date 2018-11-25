package com.manideep.finaltracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        Button addButton   = (Button) findViewById(R.id.AddButton);
        Button trackButton = (Button) findViewById(R.id.TrackButton);
        final Intent add   = new Intent(this,  AddActivity.class);
        final Intent track   = new Intent(this,  InfoActivity.class);
        final Intent maps   = new Intent(this,  MapsActivity.class);

        trackButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(track);
                    }
                }
        );

        addButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(add);
                    }
                }
        );

    }
}
