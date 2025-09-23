package com.uniq.HotelManagement.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.uniq.HotelManagement.Enum.CheckInOutStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "check_in_out_details")
public class CheckInOut {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer checkInOutId;
	
	@OneToOne
	@JoinColumn(name = "booking_id", referencedColumnName = "bookingId")
	@JsonBackReference
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	@JsonBackReference
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "admin_id", referencedColumnName = "adminId" )
	@JsonBackReference
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "room_id", referencedColumnName = "roomId")
	@JsonBackReference
	private Room room;
	
	@Column(name = "check_in_time", updatable = false)
	private LocalDate checkInDate;
	
	@Column(name = "check_out_time", updatable = false)
	private LocalDate checkOutDate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private CheckInOutStatus checkInOutStatus;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at", updatable = false)
	private LocalDateTime updatedAt;
	

	public CheckInOut() {
		super();
	}

	public CheckInOut(Booking booking, User user, Admin admin, Room room, LocalDate checkInDate, LocalDate checkOutDate,
			CheckInOutStatus checkInOutStatus, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.booking = booking;
		this.user = user;
		this.admin = admin;
		this.room = room;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.checkInOutStatus = checkInOutStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Integer getCheckInOutId() {
		return checkInOutId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public CheckInOutStatus getCheckInOutStatus() {
		return checkInOutStatus;
	}

	public void setCheckInOutStatus(CheckInOutStatus checkInOutStatus) {
		this.checkInOutStatus = checkInOutStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "CheckInOut [checkInOutId=" + checkInOutId + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", checkInOutStatus=" + checkInOutStatus + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}

	
}