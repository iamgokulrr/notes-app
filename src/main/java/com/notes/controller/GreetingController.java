package com.notes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notes.service.GreetingService;

@RestController
@RequestMapping("greet")
public class GreetingController {
	
	@Autowired
	GreetingService greetingService;
	
	@GetMapping("welcome")
	public String welcome() {
		return greetingService.getWelcomeMessage();
	}
	

}
