package com.nurvi.nurvi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/nurvi/azuretest")
public class AzureTestController {

    @GetMapping("/hello")
    public String helloAzure(){
        return "Hello Azure!";
    }
}
