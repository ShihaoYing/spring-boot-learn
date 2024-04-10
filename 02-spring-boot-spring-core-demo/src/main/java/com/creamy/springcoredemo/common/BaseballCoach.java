package com.creamy.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("In constructor: "+ getClass().getName() );
    }

    @Override
    public String getDailyWorkout() {
        return "It's baseball coach";
    }
}
