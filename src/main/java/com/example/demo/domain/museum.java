package com.example.demo.domain;

import java.util.ArrayList;

public class museum {

    //data fields
    String name;
    String address;
    int distance;
    ArrayList<String> amenities;
    String website;
    String about;
    String hours;

    //for ranking purposes or things calculated from data field
    int score;
    boolean openNow;

    //constructor
    public museum (String name, String address, int distance, String[] amenities, String website, String about, String hours){
        this.name = name;
        this.address = address;
        this.distance = distance;
        this.amenities = amenities;
        this.website = website;
        this.about = about;
        this.hours = hours;


    }

    //getters for information display purposes
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public int getDistance() {
        return this.distance;
    }

    public String getWebsite(){
        return this.website;
    }

    public boolean isOpenNow(){
        return this.openNow;
    }

    public String getAbout(){
        return this.about;
    }

    public String getHours(){
        return this.hours;
    }






    // functions for calculating scores

    public int ascore(ArrayList<String> amenities){
        int ascore = amenities.size();
        return ascore;
    }

    public int dscore(){
        return this.distance;

    }

    public int totalscore(){

    }




}