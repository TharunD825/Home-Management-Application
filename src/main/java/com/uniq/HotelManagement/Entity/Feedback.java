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
	

	public Feedback() {
		super();
	}

	
	public Feedback(Integer feedbackId, User user, Booking booking, FeedbackRating feedbackRating,
			String feedbackComments, LocalDateTime createdAt) {
		super();
		this.feedbackId = feedbackId;
		this.user = user;
		this.booking = booking;
		this.feedbackRating = feedbackRating;
		this.feedbackComments = feedbackComments;
		this.createdAt = createdAt;
	}


	public Integer getFeedbackId() {
		return feedbackId;
	}


	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Booking getBooking() {
		return booking;
	}


	public void setBooking(Booking booking) {
		this.booking = booking;
	}


	public FeedbackRating getFeedbackRating() {
		return feedbackRating;
	}


	public void setFeedbackRating(FeedbackRating feedbackRating) {
		this.feedbackRating = feedbackRating;
	}


	public String getFeedbackComments() {
		return feedbackComments;
	}


	public void setFeedbackComments(String feedbackComments) {
		this.feedbackComments = feedbackComments;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", user=" + user + ", booking=" + booking + ", feedbackRating="
				+ feedbackRating + ", feedbackComments=" + feedbackComments + ", createdAt=" + createdAt + "]";
	}
	

}
