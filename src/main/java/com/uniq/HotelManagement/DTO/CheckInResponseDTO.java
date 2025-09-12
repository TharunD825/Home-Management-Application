package com.uniq.HotelManagement.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.CheckInOutStatus;

public class CheckInResponseDTO {
	
	private Integer adminId;
	private Integer userId;
	private Integer bookingId;
	private Integer roomId;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private CheckInOutStatus checkInOutStatus;
	private LocalDateTime createdAt;
	
	
	public CheckInResponseDTO() {
		super();
	}

	public CheckInResponseDTO(Integer adminId, Integer userId, Integer bookingId, Integer roomId, LocalDate checkInDate,
			LocalDate checkOutDate, CheckInOutStatus checkInOutStatus, LocalDateTime createdAt) {
		super();
		this.adminId = adminId;
		this.userId = userId;
		this.bookingId = bookingId;
		this.roomId = roomId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.checkInOutStatus = checkInOutStatus;
		this.createdAt = createdAt;
	}


	public Integer getAdminId() {
		return adminId;
	}

	public Integer getUserId() {
		return userId;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public CheckInOutStatus getCheckInOutStatus() {
		return checkInOutStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "CheckInResponseDTO [adminId=" + adminId + ", userId=" + userId + ", bookingId=" + bookingId
				+ ", roomId=" + roomId + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", checkInOutStatus=" + checkInOutStatus + ", createdAt=" + createdAt + "]";
	}

}
