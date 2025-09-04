package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.FeedbackRating;

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
@Table(name = "feedback_details")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer feedbackId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "booking-id", referencedColumnName = "bookingId")
	private Booking booking;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private FeedbackRating feedbackRating; 
	
	@Column(name = "feedback_comments", updatable = true)
	private String feedbackComments;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	

	

}
