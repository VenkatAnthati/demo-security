package com.example.demosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {

	@GetMapping("/hello")
	public String getMessage() {
		return "Hello how are you.";
	}
}
