package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojApplication {

	public static void main(String[] args) {
		
		//Initializes the container
		//In this container it will create objects only of those classes who have @Component
		ConfigurableApplicationContext context = SpringApplication.run(FirstprojApplication.class, args);
		
		//getBean -> Creates a bean of type specified //DEPENDENCY INJECTION
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
