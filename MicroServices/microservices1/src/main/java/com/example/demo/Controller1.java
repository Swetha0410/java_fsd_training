package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
	
	@GetMapping("/")
	public Config retrieconfig() {
		return new Config(8, 5);
	}

}
