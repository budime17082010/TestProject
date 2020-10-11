package com.example.os.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootProject11OctApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject11OctApplication.class, args);
	}
	
	
	@GetMapping("/first")
	public String hello() {
		return "This is first github spring boot project";		
	}
	
	@GetMapping("/second")
	public String hello1() {
		return "This is second github spring boot project";		
	}

}
