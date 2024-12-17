package com.example.springcoredemo.rest;


import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;


    //Change it in constructor again--> this will give error because of multiple errors
    //Use Quilfier to get the exact coach
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach){

        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach=theAnotherCoach;
    }



    @GetMapping("/dailyworkout")
        public String getDailyWorkout(){
            return myCoach.getDailyWorkout();
        }

        @GetMapping("/check")
    public String checktheSameBean(){
        return " Comparing myCoach == anotherCoach:    "+ (myCoach ==anotherCoach);
        }


}
