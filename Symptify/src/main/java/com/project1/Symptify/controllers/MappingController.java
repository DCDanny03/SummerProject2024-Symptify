package com.project1.Symptify.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    @GetMapping ( "/" )
    public String index () {
        return "Greetings from Symptify, Presented by Danny and Ricky!";
    }

}
