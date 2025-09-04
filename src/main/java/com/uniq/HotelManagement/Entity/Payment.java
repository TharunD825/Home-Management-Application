package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.PaymentMode;
import com.uniq.HotelManagement.Enum.PaymentStatus;

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
@Table(name = "payment_details")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	
	@OneToOne
	@JoinColumn(name = "booking_id", referencedColumnName = "bookingId")
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User user;
	
	@Column(name = "payment_amount", updatable = false)
	private Double paymentAmount;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PaymentMode paymentMode;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PaymentStatus paymentStatus;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	public Payment() {
		super();
	}

	public Payment(Integer paymentId, Booking booking, User user, Double paymentAmount, PaymentMode paymentMode,
			PaymentStatus paymentStatus, LocalDateTime createdAt) {
		super();
		this.paymentId = paymentId;
		this.booking = booking;
		this.user = user;
		this.paymentAmount = paymentAmount;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
		this.createdAt = createdAt;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
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

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public PaymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", booking=" + booking + ", user=" + user + ", paymentAmount="
				+ paymentAmount + ", paymentMode=" + paymentMode + ", paymentStatus=" + paymentStatus + ", createdAt="
				+ createdAt + "]";
	}
	

}
