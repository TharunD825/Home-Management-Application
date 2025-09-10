package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.uniq.HotelManagement.Enum.BookingStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking_details")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	@JsonBackReference
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "room_id", referencedColumnName = "roomId")
	@JsonBackReference
	private Room room;
	
	@Column(name = "check_in_date")
	private String checkInDate;
	
	@Column(name = "check_out_date")
	private String checkOutDate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private BookingStatus bookingStatus;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<CheckInOut> checkInOut;
	

	public Booking() {
		super();
	}

	public Booking(User user, Room room, String checkInDate, String checkOutDate, BookingStatus bookingStatus,
			LocalDateTime createdAt) {
		super();
		this.user = user;
		this.room = room;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingStatus = bookingStatus;
		this.createdAt = createdAt;
	}


	public Integer getBookingId() {
		return bookingId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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

	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", bookingStatus=" + bookingStatus + ", createdAt=" + createdAt + "]";
	}

	
}
