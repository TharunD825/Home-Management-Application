package com.uniq.HotelManagement.DTO;

import java.time.LocalDateTime;

public class RoomResponseDTO {
	
	 private Integer roomId;
	 private String roomNumber;
	 private String roomType;
	 private Integer roomPrice;
	 private Integer roomCapacity;
	 private String roomStatus;
	 private LocalDateTime createdAt;
	 
	 
	 public RoomResponseDTO() {
		super();
	 }

	 public RoomResponseDTO(Integer roomId, String roomNumber, String roomType, Integer roomPrice, Integer roomCapacity,
			String roomStatus, LocalDateTime createdAt) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomCapacity = roomCapacity;
		this.roomStatus = roomStatus;
		this.createdAt = createdAt;
	 }
	 

	 public Integer getRoomId() {
		 return roomId;
	 }

	 public String getRoomNumber() {
		 return roomNumber;
	 }

	 public String getRoomType() {
		 return roomType;
	 }

	 public Integer getRoomPrice() {
		 return roomPrice;
	 }

	 public Integer getRoomCapacity() {
		 return roomCapacity;
	 }

	 public String getRoomStatus() {
		 return roomStatus;
	 }

	 public LocalDateTime getCreatedAt() {
		 return createdAt;
	 }

	 @Override
	 public String toString() {
		return "RoomResponseDTO [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType
				+ ", roomPrice=" + roomPrice + ", roomCapacity=" + roomCapacity + ", roomStatus=" + roomStatus
				+ ", createdAt=" + createdAt + "]";
	 }


}