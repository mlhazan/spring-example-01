package com.example.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.spring.entities.Employee;
import com.example.spring.entities.QuestionList;
import com.example.spring.entities.QuestionMap;


public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	
		Employee employee=(Employee)context.getBean("employee");  
		employee.show();
		
		
		QuestionList qList=(QuestionList)context.getBean("questionList");  
	    qList.displayInfo();  
	
	    QuestionMap qMap=(QuestionMap)context.getBean("questionMap");  
	    qMap.displayInfo();  
}}