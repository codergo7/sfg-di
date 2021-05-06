package com.go.springdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - From Primary Bean";
    }
}