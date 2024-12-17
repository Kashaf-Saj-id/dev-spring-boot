package com.example.springcoredemo.rest;


import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for the dependency
    private Coach myCoach;


    //FOR SETTER INJECTION YOU CAN USE ANY NAME OF THE METHOD
    @Autowired
    public void setCoach( Coach theCoach){
        myCoach=theCoach;
    }


    @GetMapping("/dailyworkout")
        public String getDailyWorkout(){
            return myCoach.getDailyWorkout();
        }



}
