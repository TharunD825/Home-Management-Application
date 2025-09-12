package com.uniq.HotelManagement.DTO;

import java.time.LocalDateTime;

public class UserResponseDTO {
	
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPhone;
	private String userRole;
	private String userAddress;
	private LocalDateTime createdAt;
	
	public UserResponseDTO() {
		super();
	}

	public UserResponseDTO(Integer userId, String userName, String userEmail, String userPhone, String userRole,
			String userAddress, LocalDateTime createdAt) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userRole = userRole;
		this.userAddress = userAddress;
		this.createdAt = createdAt;
	}
	

	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public String getUserRole() {
		return userRole;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "UserResponseDTO [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userPhone=" + userPhone + ", userRole=" + userRole + ", userAddress=" + userAddress
				+ ", createdAt=" + createdAt + "]";
	}	
	
}
