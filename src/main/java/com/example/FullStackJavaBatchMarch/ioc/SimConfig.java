package com.example.FullStackJavaBatchMarch.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SimConfig {

    @Bean
    public Idea getIdea(){
    return  new Idea();
}

    @Bean
    public Jio getJio(){
        return  new Jio();
    }
}
