package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.City;
import com.app.repository.CityRepository;


@Service
@Transactional
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityRepository cityDao;

//	@Override
//	public List<City> getAllTourPackage() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public City addCity(City city) {
		
		return cityDao.save(city);
	}

	@Override
	public String deleteCity(Long cityId) {
		// TODO Auto-generated method stub
		cityDao.deleteById(cityId);
		return "City deleted ";
	}

}
