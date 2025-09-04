package com.uniq.HotelManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu_details")
public class Menu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer menuId;
	
	@ManyToOne
	@JoinColumn(name = "restaurent_id", referencedColumnName = "restaurentId")
	private Restaurant restaurent;
	
	@Column(name = "menu_items")
	private String menuItems;
	
	@Column(name = "menu_description")
	private String menuDescription;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "availability")
	private Boolean availability;

}
