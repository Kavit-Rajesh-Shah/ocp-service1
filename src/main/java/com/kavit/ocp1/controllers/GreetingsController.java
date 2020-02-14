package com.kavit.ocp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

	@GetMapping("/greetings")
	public String sayHello(String name) {
		return "Hello " + name; 
	}
}
