package com.go.springdi.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello Repo - EN";
    }
}
