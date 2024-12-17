package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 10 push-up and play 3 matches daily.";
    }
}
