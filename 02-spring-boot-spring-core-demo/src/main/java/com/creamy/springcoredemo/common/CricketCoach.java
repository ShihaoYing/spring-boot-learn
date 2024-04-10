package com.creamy.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: "+ getClass().getName());
    }

    // define init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff: "+ getClass().getName());
    }

    // define destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff: "+ getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!~~~";
    }
}
