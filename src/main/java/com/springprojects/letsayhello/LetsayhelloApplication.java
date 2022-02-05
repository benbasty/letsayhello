package com.springprojects.letsayhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LetsayhelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetsayhelloApplication.class, args);
	}
	@GetMapping("/hello")
	public String sayingHello(@RequestParam(value = "myName", defaultValue = "My name is Ben.") String name ) {
		return String.format("Hi there, %s",name);
	}

}
