package com.notes.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	public String getWelcomeMessage() {
		return "Welcome to Notes App!";
	}
}
