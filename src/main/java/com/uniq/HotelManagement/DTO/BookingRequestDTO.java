package com.uniq.HotelManagement.DTO;

public class BookingRequestDTO {
	
	private Integer userId;   
	private Integer roomId;
    private String checkInDate;    
    private String checkOutDate;
    
    
	public BookingRequestDTO() {
		super();
	}

	public BookingRequestDTO(Integer userId, Integer roomId, String checkInDate, String checkOutDate) {
		super();
		this.userId = userId;
		this.roomId = roomId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
	}


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "BookingRequestDTO [userId=" + userId + ", roomId=" + roomId + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + "]";
	}
   

}
