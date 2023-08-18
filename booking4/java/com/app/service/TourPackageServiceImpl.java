package com.app.service;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.City;
import com.app.entity.TourPackage;
import com.app.repository.CityRepository;
import com.app.repository.TourPackageRepository;


@Service
@Transactional

public class TourPackageServiceImpl implements TourPackageService {

	
	@Autowired
	private CityRepository cityDao;
	
	@Autowired
	private TourPackageRepository tourPackageDao;
	

	@Override
	public TourPackage addTourPackage(TourPackage tourpackage) {
	
		return tourPackageDao.save(tourpackage);
	}

	@Override
	public String deleteTourPackage(Long packageid) {
		tourPackageDao.deleteById(packageid);
		return "Package deleted sucessfully";
	}

	@Override
	public List<TourPackage> getAllTourPackage() {
	
		return tourPackageDao.findAll();
	}

	@Override
	public TourPackage getTourPackageDetails(Long id) {
		
		//TourPackage tp= tourPackageDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Invalid Package ID!!!"));
	return  tourPackageDao.findById(id).orElse(null);
	}

	@Override
	public TourPackage assignCityToPackage(Long packageId, Long cityId) {
		Set<City> cities=null;
		
		TourPackage tourpackage = tourPackageDao.findById(packageId).get();
		City city= cityDao.findById(cityId).get();	
		cities=tourpackage.getAssignCities();
		cities.add(city);
		tourpackage.setAssignCities(cities);
		
		return tourPackageDao.save(tourpackage);
	}
	

}
