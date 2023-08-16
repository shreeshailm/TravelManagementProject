package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.HotelInventory;



public interface HotelInventoryRepository extends JpaRepository<HotelInventory, Long> {

}
