package com.example.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) { 
	   
	    @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");		
		Employee employee=(Employee)context.getBean("obj");  
		employee.displayInfo();  
		
		Question q=(Question)context.getBean("q");  
	    q.displayInfo();  
	}
}
