package com.go.springdi.config;

import com.go.springdi.service.ConstructorGreetingServiceImpl;
import com.go.springdi.service.I18nEnglishGreetingServiceImpl;
import com.go.springdi.service.PrimaryGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    /**
     * you can give a special name
     */
    @Bean("constructorGreetingServiceImpl")
    ConstructorGreetingServiceImpl constructorGreetingService() {
        return new ConstructorGreetingServiceImpl();
    }


    /**
     * the method name is default
     */
    @Profile("EN")
    @Bean
    I18nEnglishGreetingServiceImpl i18nEnglishGreetingService() {
        return new I18nEnglishGreetingServiceImpl();
    }

    @Primary
    @Bean
    PrimaryGreetingServiceImpl primaryGreetingService() {
        return new PrimaryGreetingServiceImpl();
    }

}
