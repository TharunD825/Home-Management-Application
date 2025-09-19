package com.uniq.HotelManagement.DTO;

public class RoomRequestDTO {
	
	private Integer adminId;
	//private String adminEmail;
//	private String adminPassword;
	
	private String roomNumber;
	private String roomType;
	private Integer roomPrice;
	private Integer roomCapacity;
	private String roomStatus;
	
	
	public RoomRequestDTO() {
		super();
	}


	public RoomRequestDTO(Integer adminId, String roomNumber, String roomType,
			Integer roomPrice, Integer roomCapacity, String roomStatus) {
		super();
		this.adminId=adminId;
		//this.adminEmail = adminEmail;
//		this.adminPassword = adminPassword;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomCapacity = roomCapacity;
		this.roomStatus = roomStatus;
	}

	public Integer getAdminId() {
		return adminId;
	}


	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}


	

//	public String getAdminPassword() {
//		return adminPassword;
//	}
//
//
//	public void setAdminPassword(String adminPassword) {
//		this.adminPassword = adminPassword;
//	}


	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
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


	public String getRoomStatus() {
		return roomStatus;
	}


	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}


	@Override
	public String toString() {
		return "RoomRequestDTO [adminId=" + adminId + ", roomNumber=" + roomNumber + ", roomType=" + roomType
				+ ", roomPrice=" + roomPrice + ", roomCapacity=" + roomCapacity + ", roomStatus=" + roomStatus + "]";
	}


	
}
