package com.example.demo.domain;

import java.util.ArrayList;

public class museum {

    //data fields
    public int index;
    public String name;
    public String address;
    public int distance;
    public String[] amenities;
    public String website;
    public String about;
    public String hours;

    //for ranking purposes or things calculated from data field
    public int totalScore;
    public boolean openNow;

    //constructor
    public museum (String name, String address, String website, String hours, String about, int distance,
                   String[] amenities, int index){
        this.name = name;
        this.address = address;
        this.distance = distance;
        this.amenities = amenities;
        this.website = website;
        this.about = about;
        this.hours = hours;
        this.totalScore = totalScore(amenities);
        this.index = index;

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

    public int getTotalScore(){
        return totalScore;
    }

    public int getIndex() {
        return this.index;
    }




    // functions for calculating scores
    //need user input from frontend
    //use that to create the String of amenities
    // for simplicity purposes, dummy data is used

    public int ascore(String[] amenities){
        int counter = 0;
        for (int i=0; i< amenities.length; i++){
            if (amenities[i].equals("T")){
                counter++;
            }
        }
        return counter;
    }

    public int dscore(){
        return this.distance;

    }

    public int totalScore(String[] amenities){
        int a = ascore(amenities);
        int d = dscore();
        int tscore = a+d;

        return tscore;


    }




}