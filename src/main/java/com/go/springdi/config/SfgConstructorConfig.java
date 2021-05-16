package com.go.springdi.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;


@ConstructorBinding
@ConfigurationProperties("go")
@Data
@RequiredArgsConstructor
public class SfgConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcurl;
}
