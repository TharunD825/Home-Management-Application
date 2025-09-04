package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.RoomStatus;
import com.uniq.HotelManagement.Enum.RoomType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_details")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	@Column(name = "room_number")
	private String roomNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RoomType roomType;
	
	@Column(name = "room_price")
	private Integer roomPrice;
	
	@Column(name = "room_capacity")
	private Integer roomCapacity;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RoomStatus roomStatus;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	

	
}
