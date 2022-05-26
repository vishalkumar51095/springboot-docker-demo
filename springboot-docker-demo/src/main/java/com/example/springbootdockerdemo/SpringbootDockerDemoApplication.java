package com.example.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){

		return "Spring Boot Docker Demo";
	}

}
