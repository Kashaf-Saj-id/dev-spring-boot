package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
    public TennisCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Play 5 Tornaments a week";
    }
}

