package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	@Column(name = "user_email", nullable = false, unique = true)
	private String userEmail;
	
	@Column(name = "user_password", nullable = false, unique = true)
	private String userPassword;
	
	@Column(name = "user_phone", nullable = false, unique = true)
	private String userPhone;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private UserRole userRole;
	
	@Column(name = "user_address", nullable = false)
	private String userAddress;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	
	public User() {
		super();
	}


	public User(Integer userId, String userName, String userEmail, String userPassword, String userPhone,
			UserRole userRole, String userAddress, LocalDateTime createdAt) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userRole = userRole;
		this.userAddress = userAddress;
		this.createdAt = createdAt;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	public UserRole getUserRole() {
		return userRole;
	}


	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", userRole=" + userRole + ", userAddress=" + userAddress
				+ ", createdAt=" + createdAt + "]";
	}
	
	
}
