package com.infiniteskills.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		DataSource dataSource = context.getBean("datasource", DataSource.class);

		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			String sql = "insert into rental_location values(?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);

			statement.setInt(1, 4);
			statement.setString(2, "Gas Station");
			statement.setString(3, "Address1");
			statement.setString(4, "Address2");
			statement.setString(5, "City");
			statement.setString(6, "State");
			statement.setString(7, "PostalCode");

			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/**
 * Instead of passing the the variables in update() you should put everything in
 * Object[] and then pass it.
 * 
 * Here is the code snippet:
 * 
 * public void create(Integer ticketNumber, Date timeOpened, String
 * priorityLevel, String caseOwner) { String sql = "insert into user_ticket
 * (ticket_number, opened, priority, case_owner) values (?, ?, ?, ?)"; Object[]
 * params = {ticketNumber, timeOpened, priorityLevel, caseOwner};
 * jdbcTemplateObject.update(sql, params);
 * 
 * System.out.println("Created Record Ticket Number = " + ticketNumber + " Time
 * Opened = " + timeOpened + "Priority Level " + priorityLevel + " Case Owner: "
 * + caseOwner); }
 */
