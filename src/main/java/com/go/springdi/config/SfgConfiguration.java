package com.go.springdi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("go")
@Data
public class SfgConfiguration {

    private String username;
    private String password;
    private String jdbcurl;
}
