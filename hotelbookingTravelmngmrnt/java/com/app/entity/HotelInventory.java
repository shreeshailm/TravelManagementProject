package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "hotel_inventory")
@Getter
@Setter
@NoArgsConstructor
public class HotelInventory extends BaseEntity{

	@NonNull
	private LocalDate Date;
	@NonNull
	private Integer availableRoom;
	@NonNull
	private Integer hotelId;
	

}
