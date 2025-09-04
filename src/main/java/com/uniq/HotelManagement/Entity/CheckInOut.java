package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

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
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "admin_id", referencedColumnName = "adminId" )
	private Admin admin;
	
	@Column(name = "check_in_time", updatable = false)
	private LocalDateTime checkInTime;
	
	@Column(name = "check_out_time", updatable = false)
	private LocalDateTime checkOutTime;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private CheckInOutStatus checkInOutStatus;
	

	public CheckInOut() {
		super();
	}

	public CheckInOut(Integer checkInOutId, Booking booking, User user, Admin admin, LocalDateTime checkInTime,
			LocalDateTime checkOutTime, CheckInOutStatus checkInOutStatus) {
		super();
		this.checkInOutId = checkInOutId;
		this.booking = booking;
		this.user = user;
		this.admin = admin;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.checkInOutStatus = checkInOutStatus;
	}

	public Integer getCheckInOutId() {
		return checkInOutId;
	}

	public void setCheckInOutId(Integer checkInOutId) {
		this.checkInOutId = checkInOutId;
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

	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}

	public LocalDateTime getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(LocalDateTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public CheckInOutStatus getCheckInOutStatus() {
		return checkInOutStatus;
	}

	public void setCheckInOutStatus(CheckInOutStatus checkInOutStatus) {
		this.checkInOutStatus = checkInOutStatus;
	}

	@Override
	public String toString() {
		return "CheckInOut [checkInOutId=" + checkInOutId + ", booking=" + booking + ", user=" + user + ", admin="
				+ admin + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", checkInOutStatus="
				+ checkInOutStatus + "]";
	}
	

}
