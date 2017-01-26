package com.infiniteskills.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.entities.RentalLocation;
import com.infiniteskills.spring.data.repositories.RentalLocationRepository;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalLocationRepository repo = context.getBean(RentalLocationRepository.class);
		//
		// System.out.println(repo.findNameById(2));
		//
		// RentalLocation location = repo.findById(3);
		// System.out.println(location.getName());
		// System.out.println(location.getAddress1());
		//
		//
		// List<RentalLocation> locations =
		// repo.findRentalLocationsByState("TX");
		//
		// for(RentalLocation locationList: locations){
		// System.out.println(locationList.getName());
		// }

		// for(RentalLocation location: locations){
		// System.out.println(location.getName());
		//
		// for(com.infiniteskills.spring.data.entities.Media media:
		// location.getMedia()){
		// System.out.println(media.getTitle());
		RentalLocation location = getLocation();

		repo.insert(location);
		System.out.println(location.getRentalLocationId());

	}

	public static RentalLocation getLocation() {
		RentalLocation location = new RentalLocation();
		location.setName("Diner");
		location.setAddress1("33 Silver Diner Lane");
		location.setAddress2("Suite 3");
		location.setCity("Salt Lake City");
		location.setState("UT");
		location.setPostalCode("172030");
		return location;
	}

}
