package com.galaxe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// This is added by Prashanth K
	public static void main(String[] args) {
		System.out.println("Shreyas interrupted");
		SpringApplication.run(DemoApplication.class, args);
	}
}
