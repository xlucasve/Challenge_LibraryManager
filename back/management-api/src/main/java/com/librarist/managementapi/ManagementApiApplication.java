package com.librarist.managementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ManagementApiApplication {

	@GetMapping("/")
	public String works(){
		return "It Works";
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagementApiApplication.class, args);
	}

}
