package com.go.springdi.service;

import com.go.springdi.repository.EnglishGreetingRepository;


//@Profile("EN")
//@Service("i18nService")
public class I18nEnglishGreetingServiceImpl implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingServiceImpl(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
