package com.creamy.springcoredemo.common;


public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("SwimCoach"+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim Coach";
    }
}
