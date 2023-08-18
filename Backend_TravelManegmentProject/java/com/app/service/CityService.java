package com.app.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.entity.City;






public interface CityService {
	
	//List<Hotel> getAllHotels();
//	List<City> getAllTourPackage();

	City addCity(City city);

	String deleteCity(Long cityId);

//	TourPackage getTourPackageDetails(Long id);
}
