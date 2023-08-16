package com.app.service;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.app.entity.HotelList;
import com.app.repository.HotelListRepository;



@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	 private HotelListRepository hoteldao ;

	@Override
	public String addHotel(MultipartFile file, String hotelName, String hotelAddress, Integer hotelCityId,
			Double hotelPrice, boolean hotelActive) {
		
		HotelList h=new HotelList();
		try {
			h.setHotelImage(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		h.setHotelName(hotelName);
		h.setHotelAddress(hotelAddress);
		h.setHotelCityId(hotelCityId);
		h.setHotelPrice(hotelPrice);
		
		h.setHotelActive(hotelActive);
		
		hoteldao.save(h);
		
		return "Hotel added succesfully";
	}

	@Override
	public String deleteHotel(Long id) {
		
		return "Hotel deleted sucessfully";
	}

}
