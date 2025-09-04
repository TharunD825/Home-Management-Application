package com.uniq.HotelManagement.Entity;

import java.time.LocalDateTime;

import com.uniq.HotelManagement.Enum.ReportType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "report_details")
public class Report {
	
	private Integer reportId;
	private Admin admin;
	private ReportType reportType;
	private LocalDateTime createdAt;
	private Integer totalBooking;
	private Double totalRevenue;
	private Double occupancyRate;
	private String reportRemarks;
	private String reportContent;

}
