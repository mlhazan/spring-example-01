package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.entities.Employee;

@SpringBootApplication
public class SpringBeanInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Employee.class, args);
		
	}
}
