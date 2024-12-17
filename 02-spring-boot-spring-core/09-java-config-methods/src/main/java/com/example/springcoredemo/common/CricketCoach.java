package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }


    //Define our destory method

    @Override
    public String getDailyWorkout() {
        return "Paractice bowling and bating daily!!!!!!" +
                "YESSSSS! YOU HAVEEEE TOOO";
    }
}
