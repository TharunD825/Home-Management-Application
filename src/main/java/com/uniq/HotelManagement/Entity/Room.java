package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.uniq.HotelManagement.Enum.RoomStatus;
import com.uniq.HotelManagement.Enum.RoomType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_details")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	
	@Column(name = "room_number")
	private String roomNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RoomType roomType;
	
	@Column(name = "room_price")
	private Integer roomPrice;
	
	@Column(name = "room_capacity")
	private Integer roomCapacity;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private RoomStatus roomStatus;
	
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Booking> booking;
	
	@ManyToOne(fetch = FetchType.LAZY)  //by default @ManyToOne and @OneToMany is Eager loading.. 
                                     	//so i made it lazy (associated entity is loaded only when required)
	@JoinColumn(name = "admin_id", referencedColumnName = "adminId")
	@JsonBackReference
	private Admin admin;
	
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<CheckInOut> checkInOut;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	

	public Room() {
	super();
	}

	public Room(String roomNumber, RoomType roomType, Integer roomPrice, Integer roomCapacity, RoomStatus roomStatus,
			List<Booking> booking, Admin admin, LocalDateTime createdAt) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomCapacity = roomCapacity;
		this.roomStatus = roomStatus;
		this.booking = booking;
		this.admin = admin;
		this.createdAt = createdAt;
	}


	public Integer getRoomId() {
		return roomId;
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


	public List<Booking> getBooking() {
		return booking;
	}


	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	

	public Admin getAdmin() {
		return admin;
	}

	
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomPrice="
				+ roomPrice + ", roomCapacity=" + roomCapacity + ", roomStatus=" + roomStatus + ", createdAt="
				+ createdAt + "]";
	}

	
}