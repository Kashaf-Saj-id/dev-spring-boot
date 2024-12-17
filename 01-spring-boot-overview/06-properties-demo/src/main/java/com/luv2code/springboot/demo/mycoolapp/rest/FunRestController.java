package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Inject properties for: coach.name & team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    //expose new endpoint for team info
    @GetMapping("/teamInfo")
    public String teaminfo(){
        return "Coach "+ coachName+ " is the mentor of team "+teamName ;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailytWorkout () {
        return "Run a hard 5k!";
    }

    @GetMapping("/healthTips")
        public String gettips(){
        return "Drink 8 glasses of water daily";
    }


}
