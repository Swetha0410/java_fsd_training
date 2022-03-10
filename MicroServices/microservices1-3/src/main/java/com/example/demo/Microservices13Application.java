package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class Microservices13Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices13Application.class, args);
	}

}
