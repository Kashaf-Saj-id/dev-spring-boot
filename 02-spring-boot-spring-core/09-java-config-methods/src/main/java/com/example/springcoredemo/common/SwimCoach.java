package com.example.springcoredemo.common;

public class SwimCoach implements Coach {
    public SwimCoach(){
        System.out.println(" In the Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as Warm-up daily";
    }
}
