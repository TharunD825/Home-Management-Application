package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.NotificationStatus;
import com.uniq.HotelManagement.Enum.NotificationType;

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
@Table(name = "notification_details")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer notificationId;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "admin_id", referencedColumnName = "adminId")
	private Admin admin;
	
	@Column(name = "notification_message")
	private String notificationMessage;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private NotificationType notificationType;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private NotificationStatus notificationStatus;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	public Notification() {
		super();
	}

	public Notification(Integer notificationId, User user, Admin admin, String notificationMessage,
			NotificationType notificationType, NotificationStatus notificationStatus, LocalDateTime createdAt) {
		super();
		this.notificationId = notificationId;
		this.user = user;
		this.admin = admin;
		this.notificationMessage = notificationMessage;
		this.notificationType = notificationType;
		this.notificationStatus = notificationStatus;
		this.createdAt = createdAt;
	}

	public Integer getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Integer notificationId) {
		this.notificationId = notificationId;
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

	public String getNotificationMessage() {
		return notificationMessage;
	}

	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}

	public NotificationStatus getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatus notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", user=" + user + ", admin=" + admin
				+ ", notificationMessage=" + notificationMessage + ", notificationType=" + notificationType
				+ ", notificationStatus=" + notificationStatus + ", createdAt=" + createdAt + "]";
	}
	

}
