package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.RestaurentStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurent_details")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer restaurentId;
	
	@Column(name = "restaurent_name")
	private String restaurentName;
	
	@Column(name = "restaurent_location")
	private String restaurentLocation;
	
	@Column(name = "restaurent_opening_hours")
	private String restaurentOpeningHours;
	
	@Column(name = "restaurent_cusine_type")
	private String restaurentCusineType;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RestaurentStatus restaurentStatus;
	
	@Column(name = "createdAt", updatable = false)
	private LocalDateTime createdAt;

}
