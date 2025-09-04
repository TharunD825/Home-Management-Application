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
	

	
}
