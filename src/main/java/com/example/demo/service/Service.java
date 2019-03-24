package com.example.demo.service;

import com.example.demo.domain.museum;
import com.example.demo.domain.importfile;
import java.util.*;


@org.springframework.stereotype.Service
public class Service {

    //museum list
    ArrayList<museum> museumList;

    importfile x = new importfile();
    museumList = x.populateList();



    public void sortMuseum (ArrayLi <museum> museumList) {
       // ArrayList<museum> sortedMuseums = new ArrayList<museum>();
        int n = museumList.size();

        for (int i =0; i<n; i++){

            int key = museumList.get(i).getTotalScore();
            int j = i-1;

            while(j>0 && museumList.get(i).getTotalScore() > key) {
                museumList.get(j+1).totalScore = key;
                j = j-1;
            }

            museumList.get(j+1).totalScore = key;


        }




    }
}
