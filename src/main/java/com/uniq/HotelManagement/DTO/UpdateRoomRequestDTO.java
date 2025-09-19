package com.uniq.HotelManagement.DTO;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.RoomStatus;
import com.uniq.HotelManagement.Enum.RoomType;

public class UpdateRoomRequestDTO {
	 private Integer roomId;
	 private String roomNumber;
	 private RoomType roomType;
	 private Integer roomPrice;
	 private Integer roomCapacity;
	 private RoomStatus roomStatus;
	 private LocalDateTime createdAt;
	 
	 public UpdateRoomRequestDTO() {
		super();
	 }

	 public UpdateRoomRequestDTO(Integer roomId, String roomNumber, RoomType roomType, Integer roomPrice,
			Integer roomCapacity, RoomStatus roomStatus, LocalDateTime createdAt) {
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

	 public void setRoomId(Integer roomId) {
		 this.roomId = roomId;
	 }

	 public String getRoomNumber() {
		 return roomNumber;
	 }

	 public void setRoomNumber(String roomNumber) {
		 this.roomNumber = roomNumber;
	 }

	 public RoomType getRoomType() {
		 return roomType;
	 }

	 public void setRoomType(RoomType roomType) {
		 this.roomType = roomType;
	 }

	 public Integer getRoomPrice() {
		 return roomPrice;
	 }

	 public void setRoomPrice(Integer roomPrice) {
		 this.roomPrice = roomPrice;
	 }

	 public Integer getRoomCapacity() {
		 return roomCapacity;
	 }

	 public void setRoomCapacity(Integer roomCapacity) {
		 this.roomCapacity = roomCapacity;
	 }

	 public RoomStatus getRoomStatus() {
		 return roomStatus;
	 }

	 public void setRoomStatus(RoomStatus roomStatus) {
		 this.roomStatus = roomStatus;
	 }

	 public LocalDateTime getCreatedAt() {
		 return createdAt;
	 }

	 public void setCreatedAt(LocalDateTime createdAt) {
		 this.createdAt = createdAt;
	 }

	 @Override
	 public String toString() {
		return "UpdateRoomRequestDTO [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType
				+ ", roomPrice=" + roomPrice + ", roomCapacity=" + roomCapacity + ", roomStatus=" + roomStatus
				+ ", createdAt=" + createdAt + "]";
	 }
	 
	 
}
