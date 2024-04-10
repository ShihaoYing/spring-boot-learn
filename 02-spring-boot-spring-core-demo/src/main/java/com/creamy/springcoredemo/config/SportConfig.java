package com.creamy.springcoredemo.config;

import com.creamy.springcoredemo.common.Coach;
import com.creamy.springcoredemo.common.SwimCoach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("creamy")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
