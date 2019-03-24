package com.example.demo.domain;
import java.io.*;
import java.util.*;

public class importfile{

    ArrayList<museum> museumList;

    public ArrayList<museum> populateList() throws IOException{
        Scanner importedFile;
        File inputFile = new File("src/mlistcopy.txt");
        ArrayList<museum> museumList = new ArrayList<museum>();

        importedFile = new Scanner(inputFile);

        while(importedFile.hasNextLine()){
            String line = importedFile.nextLine();
            String[] lineArray = line.split(";");
            String[] amenities= lineArray[6].split(",");

            System.out.println(lineArray[0]);
            System.out.println(lineArray[1]);
            System.out.println(lineArray[2]);
            System.out.println(lineArray[3]);
            System.out.println(lineArray[4]);
            System.out.println(lineArray[5]);
            System.out.println(lineArray[6]);
            System.out.println(lineArray[7]);

            museum importMuseum = new museum(lineArray[0], lineArray[1], lineArray[2],
            lineArray[3], lineArray[4], Integer.parseInt(lineArray[5]), amenities, Integer.parseInt(lineArray[7]));

            museumList.add(importMuseum);
        }

        importedFile.close();

        return museumList;





    }
}