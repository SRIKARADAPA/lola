package com.manideep.finaltracker;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    Date d1 = new GregorianCalendar(2018, Calendar.FEBRUARY, 18, 12, 50).getTime();
    Date d2 = new GregorianCalendar(2018, Calendar.MARCH, 18, 1, 50).getTime();
    Date d3 = new GregorianCalendar(2018, Calendar.AUGUST, 20, 23, 34).getTime();

    final location l1 = new location("Electronic city", 12.334, 13.23232, d1);
    final location l2 = new location("Silkboard", 12.3564, 11.23232, d2);
    final location l3 = new location("HSR", 12.4343, 10.4343, d3);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        LatLng m1 = new LatLng( 12.8399, 77.6770);
        LatLng m2 = new LatLng( 12.9177, 77.6233);
        LatLng m3 = new LatLng( 12.9592, 77.6974);
        LatLng m4 = new LatLng( 18.4386, 79.1288);
        LatLng m5 = new LatLng( 17.3984, 78.5583);
        LatLng m6 = new LatLng( 18.4681, 78.8671);
        LatLng m7 = new LatLng( 18.6725, 78.0941);


//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney").icon(BitmapDescriptorFactory.defaultMarker(100)));
        mMap.addMarker(new MarkerOptions().position(m1).title("Electronic city").icon(BitmapDescriptorFactory.defaultMarker(0)));
        mMap.addMarker(new MarkerOptions().position(m2).title("Silkboard").icon(BitmapDescriptorFactory.defaultMarker(50)));
        mMap.addMarker(new MarkerOptions().position(m3).title("Marhatalli").icon(BitmapDescriptorFactory.defaultMarker(100)));
        mMap.addMarker(new MarkerOptions().position(m4).title("Karimnagar").icon(BitmapDescriptorFactory.defaultMarker(150)));
        mMap.addMarker(new MarkerOptions().position(m5).title("hyderabad").icon(BitmapDescriptorFactory.defaultMarker(200)));
        mMap.addMarker(new MarkerOptions().position(m6).title("vemulawada").icon(BitmapDescriptorFactory.defaultMarker(250)));
        mMap.addMarker(new MarkerOptions().position(m7).title("nizamabad").icon(BitmapDescriptorFactory.defaultMarker(300)));

//    .title,.snippet
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(m1));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(m4,8));
    }
}
