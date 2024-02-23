package com.codegym.beans.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Developer fullStack(){
       return new Developer(3,"To","FullStack");
    }
    @Bean(name = "ultra-mega-developer")
    public Developer developer(){
        return new Developer(4,"ToDo","Developer");
    }
}
