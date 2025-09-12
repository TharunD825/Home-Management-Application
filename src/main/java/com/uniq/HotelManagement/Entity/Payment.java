package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name="booking_id",nullable = false)
	private Booking booking; //each payment is linked with one booking

	@Column(nullable=false)
	private Double amount;

	@Column(nullable = false)
	private String method;

	@Column(nullable = false)
	private String status;

	@Column(name="payment_date",nullable = false)
	private LocalDateTime paymentDate;
	
	private String transactionId;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Booking booking, Double amount, String method, String status, LocalDateTime paymentDate,String transactionId) {
		super();
		
		this.booking = booking;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.paymentDate = paymentDate;
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", method=" + method + ", status="
				+ status + ", paymentDate=" + paymentDate + ", transactionId=" + transactionId + "]";
	}

	public Integer getId() {
		return id;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
	////
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
