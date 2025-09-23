package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.uniq.HotelManagement.Enum.UserRole;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin_details")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	@JsonBackReference
	private Users user;
	
    @Column(name = "admin_name", nullable = false)
	private String adminName;
	
	@Column(name = "admin_email", nullable = false, unique = true)
	private String adminEmail;
	
	@Column(name = "admin_password", nullable = false, unique = true)
	private String adminPassword;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private UserRole adminRole;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy = "admin", orphanRemoval = false) // to not delete child entity from DB when parent entity becomes null
	@JsonManagedReference
	private List<Room> room;
	
	@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<CheckInOut> checkInOut;
	

	public Admin() {
		super();
	}

	public Admin(Users user, String adminName, String adminEmail, String adminPassword, UserRole adminRole,
			LocalDateTime createdAt) {
		super();
		this.user = user;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.adminRole = adminRole;
		this.createdAt = createdAt;
	}


	public Integer getAdminId() {
		return adminId;
	}
	

	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}


	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}


	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	public UserRole getAdminRole() {
		return adminRole;
	}


	public void setAdminRole(UserRole adminRole) {
		this.adminRole = adminRole;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + ", adminRole=" + adminRole + ", createdAt=" + createdAt + "]";
	}
	
	
}