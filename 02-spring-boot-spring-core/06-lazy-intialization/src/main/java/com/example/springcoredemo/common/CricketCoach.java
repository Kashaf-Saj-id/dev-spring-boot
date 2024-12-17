package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Paractice bowling and bating daily!!!!!!" +
                "YESSSSS! YOU HAVEEEE TOOO";
    }
}
