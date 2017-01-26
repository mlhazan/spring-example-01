package com.infiniteskills.spring.data.repositories;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.infiniteskills.spring.data.entities.RentalLocation;

@Repository
public class RentalLocationRepositoryImpl implements RentalLocationRepository {

	private JdbcTemplate template;
	private static final String SIMPLE_QUERY = "select name from rental_location where rental_location_id =?";

	public String findNameById(Integer id) {
		
		return template.queryForObject(SIMPLE_QUERY, new Object[]{id}, String.class);
	}

	@Autowired
	public RentalLocationRepositoryImpl(DataSource datasource) {
		this.template = new JdbcTemplate(datasource);
	}

	public void insert(RentalLocation entity) {

	}

	public void delete(RentalLocation entity) {

	}

	public void update(RentalLocation entity) {

	}

	public RentalLocation findById(Integer id) {

		return null;
	}

}
