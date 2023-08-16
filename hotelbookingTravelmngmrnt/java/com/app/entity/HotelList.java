package com.app.entity;

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
@Table(name = "hotel_details")
@Getter
@Setter
@NoArgsConstructor
public class HotelList extends BaseEntity{

	@Column(length = 50)
	private String hotelName;
	@Column(length = 200)
	private String hotelAddress;
	@NonNull
	private Integer hotelCityId;
	@NonNull
	private Double hotelPrice;
	@Lob
	private byte[] hotelImage;
	private double hotelEarning;
	private boolean hotelActive;

}
