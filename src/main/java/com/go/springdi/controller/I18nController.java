package com.go.springdi.controller;

import com.go.springdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    /**
     *no need @Autowired
     */
    //@Autowired
    public I18nController(@Qualifier("i18nEnglishGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
