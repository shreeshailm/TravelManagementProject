package com.app.service;



import org.springframework.web.multipart.MultipartFile;




public interface HotelService {

	String addHotel( MultipartFile file ,String hotelName,String hotelAddress,
			Integer hotelCityId,Double hotelPrice,boolean hotelActive);
	String deleteHotel(Long id);
}
