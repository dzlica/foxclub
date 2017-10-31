package com.example.dzlica.foxclub.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Fox {

    @Bean
    public FoxMaker foxy() {
        return new FoxMaker();
    }
}
