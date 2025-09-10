package com.uniq.HotelManagement.DTO;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.BookingStatus;

public class BookingResponseDTO {
	
	private Integer bookingId;
    private Integer userId;
    private String checkInDate;
    private String checkOutDate;
    private  BookingStatus bookingStatus;
    private LocalDateTime createdAt;
    
    
	public BookingResponseDTO() {
		super();
	}


	public BookingResponseDTO(Integer bookingId, Integer userId, String checkInDate, String checkOutDate,
			BookingStatus bookingStatus, LocalDateTime createdAt) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingStatus = bookingStatus;
		this.createdAt = createdAt;
	}



	public Integer getBookingId() {
		return bookingId;
	}


	public Integer getUserId() {
		return userId;
	}


	public String getCheckInDate() {
		return checkInDate;
	}


	public String getCheckOutDate() {
		return checkOutDate;
	}


	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	@Override
	public String toString() {
		return "BookingResponseDTO [bookingId=" + bookingId + ", userId=" + userId + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", bookingStatus=" + bookingStatus + ", createdAt=" + createdAt
				+ "]";
	}
	

}
