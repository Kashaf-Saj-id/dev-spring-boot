package com.example.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    //Define our initiallization  method
    @PostConstruct
    public void startupMethod(){
        System.out.println("In initiallization method: "+getClass(). getSimpleName());
    }

    @PreDestroy
    public void CleaningupMethod(){
        System.out.println("In destroy method: "+getClass(). getSimpleName());
    }

    //Define our destory method

    @Override
    public String getDailyWorkout() {
        return "Paractice bowling and bating daily!!!!!!" +
                "YESSSSS! YOU HAVEEEE TOOO";
    }
}
