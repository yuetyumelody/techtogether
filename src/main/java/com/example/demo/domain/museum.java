package com.example.demo.domain;

import java.util.ArrayList;

public class museum {

    //data fields
    String name;
    String address;
    int distance;
    ArrayList<String> amenities;
    String website;
    boolean openNow;
    //for ranking purposes
    int score;

    //constructor

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

    public int ascore(ArrayList<String> amenities){
        int ascore = amenities.size();
        return ascore;
    }

    public int dscore(){

    }

    public int totalscore(){


    }




}