package com.go.springdi.config;

import com.go.springdi.datasource.FakeDataSource;
import com.go.springdi.repository.EnglishGreetingRepository;
import com.go.springdi.repository.EnglishGreetingRepositoryImpl;
import com.go.springdi.service.I18nEnglishGreetingServiceImpl;
import com.go.springdi.service.PrimaryGreetingServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfdi-config.xml" )
@Configuration
public class GreetingServiceConfig {

    /**
     * you can give a special name
     */
    //@Bean("constructorGreetingServiceImpl")
  /*  ConstructorGreetingServiceImpl constructorGreetingService() {
        return new ConstructorGreetingServiceImpl();
    }*/

    @Bean
    FakeDataSource fakeDataSource(@Value("${go.username}") String username,
                                  @Value("${go.password}") String password,
                                  @Value("${go.jdbcurl}") String jdbcurl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcurl(jdbcurl);
        return fakeDataSource;
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
