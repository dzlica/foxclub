package com.example.dzlica.foxclub.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Fox {

    @Bean
    public FoxApp foxy() {
        return new FoxApp();
    }
}
