package com.uniq.HotelManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uniq.HotelManagement.DTO.CheckInOutRequestDTO;
import com.uniq.HotelManagement.DTO.CheckInResponseDTO;
import com.uniq.HotelManagement.DTO.CheckOutResponseDTO;
import com.uniq.HotelManagement.Service.CheckInOutService;

@Controller
@RequestMapping("/bookedroom")
public class CheckInOutController {
	
	private CheckInOutService checkInoutService;
	
	@Autowired
	public CheckInOutController(CheckInOutService checkInoutService) {
		
		this.checkInoutService = checkInoutService;
		
	}
	
	@PutMapping("/checkin")
	public CheckInResponseDTO checkIn(@RequestBody CheckInOutRequestDTO checkInDTO) {
		
		CheckInResponseDTO checkInResponseDTO = checkInoutService.checkIn(checkInDTO);
				
		return checkInResponseDTO;
	}
	
	@PutMapping("/checkout")
	public CheckOutResponseDTO checkOut(@RequestBody CheckInOutRequestDTO checkInDTO) {
		
		CheckOutResponseDTO checkOutResponseDTO = checkInoutService.checkOut(checkInDTO);
		
		return checkOutResponseDTO;
	}

}