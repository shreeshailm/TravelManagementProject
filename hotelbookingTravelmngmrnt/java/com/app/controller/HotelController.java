package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.app.entity.HotelList;

import com.app.service.HotelService;

@RestController
@RequestMapping("/hotel")
@CrossOrigin(origins = "*")
public class HotelController {

	@Autowired
	private HotelService hotelservice;


	@PostMapping
	public String addHotel(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
			@RequestParam("add") String add, @RequestParam("cityID") Integer cityId, @RequestParam("price") Double price,
			@RequestParam("active") Boolean hotelactive) {

		return hotelservice.addHotel(file, name, add, cityId, price, false);
	}

	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		return hotelservice.deleteHotel(id);

		
		
	}
}
