package com.example.demo.domain;
import java.io.*;
import java.util.*;

public class importfile{

    ArrayList<museum> museumList;

    public ArrayList<museum> populateList() throws IOException{
        Scanner importedFile;
        File inputFile = new File("museums - museums.csv");
        ArrayList<museum> museumList = new ArrayList<museum>();

        importedFile = new Scanner(inputFile);

        while(importedFile.hasNextLine()){
            String line = importedFile.nextLine();
            String[] lineArray = line.split(",");
            String[] amenities= lineArray[6].split(",");

            museum importMuseum = new museum(lineArray[0], lineArray[1], lineArray[2],
            lineArray[3], lineArray[4], Integer.parseInt(lineArray[5]), amenities);

            museumList.add(importMuseum);
        }

        importedFile.close();

        return museumList;





    }
}