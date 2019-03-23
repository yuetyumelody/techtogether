package com.example.demo.controller;

import com.example.demo.domain.museum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/museums")
public class Controller {

    @GetMapping
    public museum getMuseum(){

        String[] amenities = {"ramps", "braille", "guide dogs"};

        museum moma = new museum("moma", "moma address",5, amenities,
                "moma.org", "about mom", "9am-9pm");

        return moma;

    }
}
