package com.manideep.finaltracker;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;
public class location implements Parcelable {
    String name;
    private double latitude;
    private double longitude;
    Date d1;
    location(){

    }
    location(String name,double Latitude,double Longitude,Date d1){
        this.name=name;
        this.latitude=Latitude;
        this.longitude=Longitude;
        this.d1=d1;
    }

    protected location(Parcel in) {
        name = in.readString();
        latitude = in.readDouble();
        longitude = in.readDouble();
    }

    public static final Creator<location> CREATOR = new Creator<location>() {
        @Override
        public location createFromParcel(Parcel in) {
            return new location(in);
        }

        @Override
        public location[] newArray(int size) {
            return new location[size];
        }
    };

    String getName(){
        return name;
    }
    double getLatitude(){
        return latitude;
    }
    double getLongitude(){
        return longitude;
    }
    Date getD1(){
        return d1;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);
    }
}


