package com.jenkins.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	
	
	@GetMapping(value = "/welcome")
	public String testing() {
		
		return "Working fine commit 4";
	}

}
