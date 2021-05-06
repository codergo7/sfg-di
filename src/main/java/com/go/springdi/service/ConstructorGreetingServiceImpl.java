package com.go.springdi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello-Constructor";
    }
}
