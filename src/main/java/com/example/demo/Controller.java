package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Controller {

	private String password = "my-password";

	@GetMapping(value = "/hello")
	public String hello(){
		int i = 1/0;
		return "hello world!";
	}

	@GetMapping(value = "/password")
	public String password(){
		return password;
	}
}
