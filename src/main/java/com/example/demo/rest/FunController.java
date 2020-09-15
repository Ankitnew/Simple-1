package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello dhs";
	}
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		return "Hello has been said !";
	}

}
