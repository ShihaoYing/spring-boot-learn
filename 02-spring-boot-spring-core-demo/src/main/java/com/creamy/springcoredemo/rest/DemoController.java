package com.creamy.springcoredemo.rest;


import com.creamy.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("creamy") Coach theCoach,
                          @Qualifier("baseballCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/check")
    public String check(){
        return "Compare beans: " + (myCoach ==anotherCoach);}
    }
