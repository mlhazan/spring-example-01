package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.spring.entities.Employee;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		// inheritance
		Employee employee = (Employee) context.getBean("employee2");
		employee.show();

	}
}