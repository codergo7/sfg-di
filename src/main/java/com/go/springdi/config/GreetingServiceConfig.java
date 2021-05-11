package com.go.springdi.config;

import com.go.springdi.service.ConstructorGreetingServiceImpl;
import com.go.springdi.service.I18nEnglishGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    /**
     * you can give a special name
     */
    @Bean("constructorGreetingServiceImpl")
    ConstructorGreetingServiceImpl constructorGreetingService(){
        return new ConstructorGreetingServiceImpl();
    }


    /**
     * the method name is default
     */
    @Bean //
    I18nEnglishGreetingServiceImpl i18nEnglishGreetingService(){
        return new I18nEnglishGreetingServiceImpl();
    }

}
