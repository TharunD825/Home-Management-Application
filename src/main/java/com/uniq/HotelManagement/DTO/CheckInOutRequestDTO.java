package com.uniq.HotelManagement.DTO;

public class CheckInOutRequestDTO {
	
	private String adminEmail;
	private Integer checkInOutId;
	
	
	public CheckInOutRequestDTO() {
		super();
	}
	
	public CheckInOutRequestDTO(String adminEmail, Integer checkInOutId) {
		super();
		this.adminEmail = adminEmail;
		this.checkInOutId = checkInOutId;
	}
	
	
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public Integer getCheckInOutId() {
		return checkInOutId;
	}
	public void setCheckInOutId(Integer checkInOutId) {
		this.checkInOutId = checkInOutId;
	}
	@Override
	public String toString() {
		return "CheckInOutRequestDTO [adminEmail=" + adminEmail + ", checkInOutId=" + checkInOutId + "]";
	}

}
