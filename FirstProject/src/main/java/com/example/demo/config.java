package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class config {
	@RequestMapping("/hello")
	public String hello() {
		return "Hellow Spring boot";
		
	}

}
