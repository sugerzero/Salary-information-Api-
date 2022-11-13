package com.example.vueparentss.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RequestMapping("/angular")
public class AngularController {

    @RequestMapping("/user")
    public String  user(){
        return "Succeee";
    }
}
