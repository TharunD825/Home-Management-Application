package com.uniq.HotelManagement.Service;

import com.uniq.HotelManagement.DTO.CheckInOutRequestDTO;
import com.uniq.HotelManagement.DTO.CheckInResponseDTO;
import com.uniq.HotelManagement.DTO.CheckOutResponseDTO;

public interface CheckInOutService {
	
	CheckInResponseDTO checkIn(CheckInOutRequestDTO checkInDTO);
	
	CheckOutResponseDTO checkOut(CheckInOutRequestDTO checkInDTO);

}