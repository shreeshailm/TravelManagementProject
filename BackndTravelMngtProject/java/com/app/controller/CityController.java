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
	
//	@GetMapping
//	public ResponseEntity<?> listAllHotel(){
//		List<Hotel> list = hotelservice.getAllHotels();
//		if(list == null)
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		return ResponseEntity.ok(list);
//	}
//	
//	@GetMapping("")
//	public ResponseEntity<?> findAllAppointment() {
//		List<Appointment> list = appointmentImp.allAppointment();
//		if (list == null)
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		return ResponseEntity.ok(list);
//	}
	
//	@GetMapping
//	public ResponseEntity<?> listAllTourPackage(){
//		List<TourPackage> list= tourPackageService.getAllTourPackage();
//		if(list==null)
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		return ResponseEntity.ok(list);
//	}
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> getTourPackageDetailsById(@PathVariable Long id) {
//		
//		TourPackage n =tourPackageService.getTourPackageDetails(id);
//		if(n==null)
//			return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		return ResponseEntity.ok(n);
//	}
	


//	
//	@PutMapping
//	public Hotel updateHotelDetails(@RequestBody Hotel detachedHotel) {
//		
//		hotelservice.getHotelDetails(detachedHotel.getHotelId());
//		// => emp exists by the id --> continue to update
//		return hotelservice.addHotel(detachedHotel);
//	}
//	

//	@PutMapping
//	public String updateHotelDetails(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
//			@RequestParam("add") String add, @RequestParam("cityID") Integer cityId, @RequestParam("price") Double price,
//			@RequestParam("active") Boolean hotelactive) {
//		
//		
//		
//
//	
//		return hotelservice.addHotel(file, name, add, cityId, price, false);
//	}
	

	
	
	@PostMapping
	public City saveCity(@RequestBody City city) {
		return cityService.addCity(city);
	}
	
	
	

//	@PostMapping
//	public String addHotel(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
//			@RequestParam("add") String add, @RequestParam("cityID") Integer cityId, @RequestParam("price") Double price,
//			@RequestParam("active") Boolean hotelactive) {
//
//		return hotelservice.addHotel(file, name, add, cityId, price, false);
//	}

	@DeleteMapping("/{id}")
	public String deleteCity(@PathVariable Long id) {
		return cityService.deleteCity(id);

		
		
	}
}
