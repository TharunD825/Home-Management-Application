package com.uniq.HotelManagement.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserRequestDTO {
	
	@NotBlank(message = "Name should not be empty")
	@Size(min=3, message = "Name length should be greater than 3")
	private String userName;
	
	@NotBlank(message = "Name should not be empty")
	private String userEmail;
	
	@NotBlank(message = "Password should not be empty")
    private String userPassword;
	
	@NotBlank(message = "Phone number should not be empty")
	@Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be 10 digits")
	private String userPhone;
	
	@NotBlank(message = "Role should not be empty")
	private String userRole;
	
	@NotBlank(message = "Address should not be empty")
	private String userAddress;
	
	public UserRequestDTO() {
		super();
	}

	public UserRequestDTO(String userName, String userEmail, String userPassword, String userPhone, String userRole,
			String userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userRole = userRole;
		this.userAddress = userAddress;
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

	@Override
	public String toString() {
		return "UserRequestDTO [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userPhone=" + userPhone + ", userRole=" + userRole + ", userAddress=" + userAddress + "]";
	}


}
