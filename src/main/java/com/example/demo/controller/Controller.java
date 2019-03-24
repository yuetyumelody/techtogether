package com.example.demo.controller;

import com.example.demo.domain.museum;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/museums")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping
    public List<museum> getMuseum(){

        return moma;

    }
}
