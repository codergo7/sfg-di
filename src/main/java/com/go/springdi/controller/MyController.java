package com.go.springdi.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sqyHello(){
        System.out.println("Hello World");

        return "Hi Everyone";
    }

}
