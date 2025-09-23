package com.uniq.HotelManagement.DTO;

import com.uniq.HotelManagement.Enum.RoomStatus;
import com.uniq.HotelManagement.Enum.RoomType;

public class UpdateRoomRequestDTO {

	private String roomNumber;
	 private RoomType roomType;
	 private Integer roomPrice;
	 private Integer roomCapacity;
	 private RoomStatus roomStatus;
	 
	 public UpdateRoomRequestDTO() {
		super();
	 }

	 public UpdateRoomRequestDTO(String roomNumber, RoomType roomType, Integer roomPrice, Integer roomCapacity,
			RoomStatus roomStatus) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomCapacity = roomCapacity;
		this.roomStatus = roomStatus;
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

	 @Override
	 public String toString() {
		return "UpdateRoomRequestDTO [roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomPrice=" + roomPrice
				+ ", roomCapacity=" + roomCapacity + ", roomStatus=" + roomStatus + "]";
	 }
	 
	 
}
