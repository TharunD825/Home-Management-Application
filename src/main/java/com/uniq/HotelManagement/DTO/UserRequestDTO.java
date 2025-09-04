package com.uniq.HotelManagement.DTO;

import java.time.LocalDateTime;

public class UserRequestDTO {
	
	private String userName;
	private String userEmail;
    private String userPassword;
	private String userPhone;
	private String userRole;
	private String userAddress;
	private LocalDateTime createdAt;
	
	public UserRequestDTO() {
		super();
	}

	public UserRequestDTO(String userName, String userEmail, String userPassword, String userPhone, String userRole,
			String userAddress, LocalDateTime createdAt) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userRole = userRole;
		this.userAddress = userAddress;
		this.createdAt = createdAt;
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

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
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
		return "UserRequestDTO [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", userRole=" + userRole + ", userAddress=" + userAddress
				+ ", createdAt=" + createdAt + "]";
	}

}
