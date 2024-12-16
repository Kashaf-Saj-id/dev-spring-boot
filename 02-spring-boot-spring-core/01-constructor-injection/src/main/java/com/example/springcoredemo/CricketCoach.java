package com.example.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Paractice bowling and bating daily!!!!!!";
    }
}
