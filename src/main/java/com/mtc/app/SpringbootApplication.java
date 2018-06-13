package com.mtc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootApplication {
	
	 @RequestMapping("/hello")
	 public String home() {
	        return "Hello Docker World";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
