package com.example.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Enables --> Autoconfigurations, components scanning, Additional configurations
@SpringBootApplication
		//(
		//scanBasePackages = {"com.example.springcoredemo",
		//					"com.example.util"}
        //)
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		//Spring.Application: Bootstrap your Springboot application
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
