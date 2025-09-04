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
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant_payment_details")
public class RestaurantPayment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	
	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "OrderId")
	private RestaurantOrder restaurantOrder;
	
	@Column(name = "amount")
	private Double amount;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PaymentMode paymentMode;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PaymentStatus paymentStatus;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

}
