package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class Controller3 {
	@GetMapping("/fault")
	@HystrixCommand(fallbackMethod="fallbackDisplay")
	public void Display() {
		System.out.println("in display");
		throw new RuntimeException("services down");
	}
	
	
	
	public void fallbackDisplay() {
		System.out.println("in fallback method");
		
	}

}

