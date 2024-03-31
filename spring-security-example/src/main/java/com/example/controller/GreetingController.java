package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GreetingController {


    @RequestMapping(value = "/greet",method = GET)
    public String getGreeting(){

        return "Hello world . Welcome to spring security tutorial";
    }
}
