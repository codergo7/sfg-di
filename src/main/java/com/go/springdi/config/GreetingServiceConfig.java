package com.go.springdi.config;

import com.go.springdi.repository.EnglishGreetingRepository;
import com.go.springdi.repository.EnglishGreetingRepositoryImpl;
import com.go.springdi.service.ConstructorGreetingServiceImpl;
import com.go.springdi.service.I18nEnglishGreetingServiceImpl;
import com.go.springdi.service.PrimaryGreetingServiceImpl;
import comcom.go.springdi.pets.CatPetService;
import comcom.go.springdi.pets.DogPetService;
import comcom.go.springdi.pets.PetService;
import comcom.go.springdi.pets.PetServiceFactory;
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


    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    /**
     * the method name is default
     */
    @Profile("EN")
    @Bean
    I18nEnglishGreetingServiceImpl i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingServiceImpl(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingServiceImpl primaryGreetingService() {
        return new PrimaryGreetingServiceImpl();
    }
}
