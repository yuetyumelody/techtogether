package com.example.demo.service;

import com.example.demo.domain.museum;
import com.example.demo.domain.importfile;

import java.io.IOException;
import java.util.*;


@org.springframework.stereotype.Service
public class Service {

    //museum list
    importfile x = new importfile();
    ArrayList<museum> museumList;

    public Service() throws IOException {
        museumList = x.populateList();
    }

    public ArrayList<museum> getMuseumList(){
        return museumList;
    }




    public ArrayList<museum> sortMuseum (ArrayList <museum> museumList) {
       // ArrayList<museum> sortedMuseums = new ArrayList<museum>();
        int n = museumList.size();
        ArrayList<museum> sortedMuseums = new ArrayList<museum>();

        for (int i =0; i<n; i++){

            int key = museumList.get(i).getTotalScore();
            int j = i-1;

            while(j>=0 && museumList.get(i).getTotalScore() > key) {
                museumList.get(j+1).totalScore = museumList.get(j).totalScore;
                j = j-1;
            }

            museumList.get(j+1).totalScore = key;

        }
        for (int k=9; k>=0; k--){
            sortedMuseums.add(museumList.get(k));

        }
        return sortedMuseums;




    }
}
