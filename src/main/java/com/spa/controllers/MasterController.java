package com.spa.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MasterController {



    @GetMapping(path = "/check")
    public String main(){
        return "hello world";
    }


}
