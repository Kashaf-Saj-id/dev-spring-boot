package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
