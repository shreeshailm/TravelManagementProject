package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.City;
import com.app.entity.Hotel;
import com.app.entity.TourPackage;
import com.app.service.CityService;
import com.app.service.HotelService;
import com.app.service.HotelServiceImpl;
import com.app.service.TourPackageService;

@RestController
@RequestMapping("/city")
@CrossOrigin(origins = "*")
public class CityController {

	@Autowired
	private CityService cityService;
	

	
	
	@PostMapping
	public City saveCity(@RequestBody City city) {
		return cityService.addCity(city);
	}
	
	


	@DeleteMapping("/{id}")
	public String deleteCity(@PathVariable Long id) {
		return cityService.deleteCity(id);

		
		
	}
}
