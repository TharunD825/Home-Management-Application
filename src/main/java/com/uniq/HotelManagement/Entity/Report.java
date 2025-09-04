package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.ReportType;

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
@Table(name = "report_details")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reportId;
	
	@ManyToOne
	@JoinColumn(name = "admin_id", referencedColumnName="adminId")
	private Admin admin;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ReportType reportType;
	
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "total_booking")
	private Integer totalBooking;
	
	@Column(name = "total_revenue")
	private Double totalRevenue;
	
	@Column(name = "occupancy_rate")
	private Double occupancyRate;
	
	@Column(name = "report_remark")
	private String reportRemark;
	
	@Column(name = "report_content")
	private String reportContent;

	
}
