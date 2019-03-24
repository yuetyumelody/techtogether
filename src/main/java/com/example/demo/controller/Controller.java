package com.example.demo.controller;

import com.example.demo.domain.museum;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/museums")
    public ArrayList<museum> getSortedMuseumList(){

        ArrayList<museum> sortedList = service.sortMuseum(service.getMuseumList());

        return sortedList;

    }

    @GetMapping("/museum")
    public museum getMuseum(@RequestParam int id){
        ArrayList<museum> mList = service.sortMuseum(service.getMuseumList());

        return mList.get(id);


    }
}
