package com.manideep.finaltracker;
import java.io.Serializable;
import java.util.ArrayList;

import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Pair;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,Serializable {

    private GoogleMap mMap;

    Bundle userdata = getIntent().getExtras();
    location l1= (location) getIntent().getParcelableExtra("location");
    String username = userdata.getString("username");
    ArrayList < Double > getLocations(  ){

        ArrayList< Double> Location;
        Location = null;
        return Location;

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
//            GoogleMap mMap;
//
//            int iterater,size;
//            double latitude , longitude ;
//            ArrayList<Double> locationData;
//            locationData = getLocations();
//            size = locationData.size();
//            LatLng location;
//            String time;
//
//            for(iterater = 0 ; iterater < size ; iterater+=3 ){
//
//                time = Double.toString(locationData.get(iterater));
//                latitude = locationData.get(iterater+1);
//                longitude=locationData.get(iterater+2);
//                location = new LatLng(latitude , longitude );
//                mMap.addMarker(new MarkerOptions().position( location ).title( time ) );
//                mMap.moveCamera(CameraUpdateFactory.newLatLng(location));
//




    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        int iterater,size;
        double latitude , longitude ;
        ArrayList<Double> locationData;
        locationData = getLocations();
        size = locationData.size();
        LatLng location;
        String time;

        for(iterater = 0 ; iterater < size ; iterater+=3 ){

            time = Double.toString(locationData.get(iterater));
            latitude = locationData.get(iterater+1);
            longitude=locationData.get(iterater+2);
            location = new LatLng(latitude , longitude );
            mMap.addMarker(new MarkerOptions().position( location ).title( time ) );
            mMap.moveCamera(CameraUpdateFactory.newLatLng(location));

        }


//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
