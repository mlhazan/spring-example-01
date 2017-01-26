package com.infiniteskills.spring;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringApplication_2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		DataSource dataSource = context.getBean("datasource", DataSource.class);		
		JdbcTemplate template = new JdbcTemplate(dataSource);

		template.update("insert into rental_location value(?,?,?,?,?,?,?)", 3, "Grocery Store", "3306 Trisle Park",
				null, "Pivotal Spring", "WA", "12345678");

	}

}