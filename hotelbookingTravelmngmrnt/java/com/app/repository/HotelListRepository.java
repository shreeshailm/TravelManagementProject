package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.entity.HotelList;

public interface HotelListRepository extends JpaRepository<HotelList, Long> {

}
