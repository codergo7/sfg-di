package com.go.springdi.service;


import org.springframework.stereotype.Service;

@Service/*(value = "ali") // you can give a specific name*/
public class PropertyGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello-Property";
    }
}
